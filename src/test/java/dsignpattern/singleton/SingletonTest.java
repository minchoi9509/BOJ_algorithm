package dsignpattern.singleton;

import designpattern.singleton.*;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void 싱글톤() {
//        1. 유닛 종류별로 세명씩 생성한다. (기본 정보출력)
        Citizen citizen1 = new Citizen(10, new HandsAttack(), new WalkingMove());
        Citizen citizen2 = new Citizen(10, new HandsAttack(), new WalkingMove());
        Citizen citizen3 = new Citizen(10, new HandsAttack(), new WalkingMove());
        Knight knight1 = new Knight(30, new KnifeAttack(), new WalkingMove());
        Knight knight2 = new Knight(30, new KnifeAttack(), new WalkingMove());
        Knight knight3 = new Knight(30, new KnifeAttack(), new WalkingMove());
        Wizard wizard1 = new Wizard(20, new FireBallAttack(), new FlyingMove());
        Wizard wizard2 = new Wizard(20, new FireBallAttack(), new FlyingMove());
        Wizard wizard3 = new Wizard(20, new FireBallAttack(), new FlyingMove());
        Units.getInstance().add(citizen1);
        Units.getInstance().add(citizen2);
        Units.getInstance().add(citizen3);
        Units.getInstance().add(knight1);
        Units.getInstance().add(knight2);
        Units.getInstance().add(knight3);
        Units.getInstance().add(wizard1);
        Units.getInstance().add(wizard2);
        Units.getInstance().add(wizard3);
//        2. 유닛 목록을 출력한다.
        System.out.println(Units.getInstance());
//        3. 시민이 죽었다. (정보출력)
        citizen1.dead();
        citizen2.dead();
        citizen3.dead();
//        4. 유닛 목록을 출력한다.
        System.out.println(Units.getInstance());
//        5. 기사를 한명더 생성한다.

//        6. 유닛 목록을 출력한다.
//        7. 모든 유닛이 동시에 공격한다.
//        8. 모든 유닛이 죽었다.
//        9. 유닛 목록을 출력한다.
    }

}
