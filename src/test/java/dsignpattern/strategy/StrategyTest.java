package dsignpattern.strategy;

import designpattern.strategy.*;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    public void 스트래티지() {
//        1. 유닛 종류별로 세명씩 생성한다. (기본 정보출력)
        Citizen citizen = new Citizen(10, new HandsAttack(), new WalkingMove());
        Knight knight = new Knight(30, new KnifeAttack(), new WalkingMove());
        Wizard wizard = new Wizard(20, new FireBallAttack(), new FlyingMove());
        System.out.println(citizen);
        System.out.println(knight);
        System.out.println(wizard);
//        2. 시민 +10, -10 이동후 공격명령
        System.out.println("2. 시민 +10, -10 이동후 공격명령");
        citizen.move(10, -10);
        citizen.attack();
        System.out.println("3. 기사 +30, +40 이동후 공격명령");
//        3. 기사 +30, +40 이동후 공격명령
        knight.move(30, 40);
        knight.attack();
        System.out.println("4. 마법사 +30, +40 이동후 공격명령");
        wizard.move(30, 40);
        wizard.attack();
//        5. 기사가 검을 잃어버려 맨손으로 돌아왔다.
        knight.setAttackStrategy(null);
//        6. 시민을 기사의 위치로 이동명령
        System.out.println("6. 시민을 기사의 위치로 이동명령");
        citizen.moveAt(knight.getLocationX(), knight.getLocationY());
//        7. 시민이 검을 주웠다. 검으로 공격명령
        citizen.setAttackStrategy(new KnifeAttack());
//        8. 기사 -200, -200 이동명령
        knight.move(-200, -200);
//        9. 세 유닛의 정보 출력
        System.out.println(citizen);
        System.out.println(knight);
        System.out.println(wizard);
    }

}
