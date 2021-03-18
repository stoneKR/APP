fun main(args : Array<String> ){

    // let()
    // 결과를 { -> } 안으로 넘긴다. 그 안에서 이미 선언한 변수처럼 사용한다.
    // ->를 삭제하면 기본변수인 it로 인식한다.
    letTest().let { value -> println ( value) };
    letTest().let { println ( it ) };

    // apply()
    // 파스칼의 with문과 유사함. [객체이름.뭐뭐뭐] 코딩하는 고생이 덜었음.
    var obj = TestClass1().apply { sName = "동작구 스눕독"; nAge = 39; }
    obj.aboutMe();

    // run()

    obj.run { sName = "동작구 에미넴"; aging(); sName }.let { println (it); }
    obj.aboutMe();
}

fun letTest() = 10;

class TestClass1{
    var sName   : String = "";
    var nAge    : Int    = 49;
    fun aboutMe() = println("이름은 \"$sName\"이고 나이는 $nAge 입니다. ");
    fun aging() = nAge++;
}