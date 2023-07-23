package ch08;

public class Ex08_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			startInstall();  // 프로그램 설치에 필요한 준비를 한다.
			copyFile();  // 파일을 복사한다.
		} catch (SpaceException se) {
			System.out.println("에러 메세지: " + se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보한 후 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메세지: " + me.getMessage());
			me.printStackTrace();
			System.out.println("다시 시도해주세요.");
		}finally {
			deleteTempFiles();
			// 프로그램 설치에 사용된 임시 파일을 삭제한다.
			// finally는 무조건 실행된다.
		}
	}



static void startInstall() throws SpaceException, MemoryException {
	if(!enoughSpace())
		throw new SpaceException("설치 공간이 부족합니다.");
	if(!enoughMemory())
		throw new MemoryException("메모리가 부족합니다.");
}

	static void copyFile() {}  // 파일을 복사하는 메서드
	static void deleteTempFiles() {} // 임시 파일을 삭제하는 메서드
	static boolean enoughSpace() {
		// 설치에 필요한 공간이 있는지 확인하는 메서드
		return false;
	}

	static boolean enoughMemory() {
		// 설치에 필요한 메모리 공간이 있는지 확인하는 메서드
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}