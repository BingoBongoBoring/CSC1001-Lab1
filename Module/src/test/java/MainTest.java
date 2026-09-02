import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addSix() {
        assertEquals(45, Main.addSix(39));
    }

    @Test
    void addSeventeen() { assertEquals(18, Main.addSeventeen(1)); }

    @Test
    void decryptorA() {
        assertEquals("miasma", Main.decryptorA("*miasma*"));
        assertEquals("michael", Main.decryptorA("*michael*"));
        assertEquals("hello there everybody", Main.decryptorA("*hello there everybody*"));
    }
    @Test
    void decryptorB() {
        assertEquals("miasma", Main.decryptorB("aiasmm"));
        assertEquals("mantelpiece", Main.decryptorB("eantelpiecm"));
        assertEquals("hello there everybody", Main.decryptorB("yello there everybodh"));
    }
    @Test
    void decryptorC() {
        assertEquals("miasma", Main.decryptorC("iasmamay"));
        assertEquals("mantelpiece", Main.decryptorC("antelpiecemay"));
        assertEquals("largesse", Main.decryptorC("argesselay"));
        assertEquals("hello there everybody", Main.decryptorC("ello there everybodyhay"));
    }
    @Test
    void decryptorD() {
        assertEquals("miasma", Main.decryptorD("miamas"));
        assertEquals("mantelpiece", Main.decryptorD("mantepiecel"));
        assertEquals("largesse", Main.decryptorD("largssee"));
        assertEquals("hello there everybody", Main.decryptorD("hello ther everybodye"));
        assertEquals("antediluvian", Main.decryptorD("antediuvianl"));
        assertEquals("hi", Main.decryptorD("hi"));
    }
    @Test
    void decryptorLA() {
        assertEquals("miasma", Main.decryptorLA("amsmia"));
        assertEquals("mantelpiece", Main.decryptorLA("eceiplmante"));
        assertEquals("largesse", Main.decryptorLA("esselarg"));
        assertEquals("hello there everybody", Main.decryptorLA("ydobyreve ehello ther"));
        assertEquals("antediluvian", Main.decryptorLA("naivulantedi"));
        assertEquals("hi", Main.decryptorLA("ih"));
        assertEquals("whisker pole", Main.decryptorLA("elop rwhiske"));
        assertEquals("広島市（ひろしまし）は、広島県の西部、安芸地方にある市。政令指定都市・中枢中核都市に指定されている。", Main.decryptorLA("。るいてれさ定指に市都核中枢中・市都定指令政。市る広島市（ひろしまし）は、広島県の西部、安芸地方にあ"));
    }
    @Test
    void decryptorLB() {
        assertEquals("miasma", Main.decryptorLB("moesme"));
        assertEquals("mantelpiece", Main.decryptorLB("mentilpoici"));
        assertEquals("largesse", Main.decryptorLB("lergissi"));
        assertEquals("hello there everybody", Main.decryptorLB("hillu thiri ivirybudy"));
        assertEquals("antediluvian", Main.decryptorLB("entidolavoen"));
        assertEquals("whisker pole", Main.decryptorLB("whoskir puli"));
        assertEquals("広島市（ひろしまし）は、広島県の西部、安芸地方にある市。政令指定都市・中枢中核都市に指定されている。", Main.decryptorLB("広島市（ひろしまし）は、広島県の西部、安芸地方にある市。政令指定都市・中枢中核都市に指定されている。"));
    }
//    @Test
//    void decryptorLC() {
//        assertEquals("miasma", Main.decryptorLC("maasmi"));
//        assertEquals("mantelpiece", Main.decryptorLC("mcnielpteae"));
//        assertEquals("largesse",
//             Main.decryptorLC("lersegsa"));
//        assertEquals("hello there everybody",
//             Main.decryptorLC("hdlbortve erehe yloey"));
//        assertEquals("antediluvian", Main.decryptorLC("antidulivean"));
//        assertEquals("whisker pole", Main.decryptorLC("weiok repslh"));
//    }
}
