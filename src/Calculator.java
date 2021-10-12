public class Calculator {

    /*production code*/
    int add(int i, int j) {
        return i+j;
    }
    int subtract(int i, int j) {
        return i-j;
    }
    int multiply(int i, int j) {
        return i*j;
    }
    int divide(int i, int j) {
        return i/j;
    }
    /*production code*/

    /*
    * main method 테스트 문제점
    Production code와 Test Code가 클래스 하나에 존재한다. 클래스 크기가 커짐. 복잡도 증가함.
    Test Code가 실 서비스에 같이 배포됨.
    main method 하나에서 여러 개의 기능을 테스트 함. 복잡도 증가.
    method 이름을 통해 어떤 부분을 테스트하는지에 대한 의도를 드러내기 힘듦.
    테스트 결과를 사람이 수동으로 확인
    * */
    public static void main(String[] args) {
        /*test code*/
        Calculator cal = new Calculator();
        System.out.println(cal.add(3,4));
        System.out.println(cal.subtract(5,4));
        System.out.println(cal.multiply(4,3));
        System.out.println(cal.divide(10,2));
        /*test code*/
    }
}
