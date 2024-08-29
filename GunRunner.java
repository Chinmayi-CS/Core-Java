package com.xworkz.classes.runner;

import com.xworkz.classes.things.*;

public class GunRunner {

    public static void main(String[] args) {

        Soldier soldier = new Soldier();
        soldier.gun();

        System.out.println("================================");

        Police police = new Police();
        Gun gun = new Gun();
        police.arrest(gun);

        System.out.println("++++++++++++++++++++++++++++++++++");

        Dboss dboss = new Dboss();
        dboss.jail(gun);

        System.out.println("*************************************");

        Godse godse = new Godse();
        Gun ref = new Gun();
        godse.fighter();
        if(ref!=null)
        {
           gun.fire();
           gun.display();
        }
        else {
            System.out.println("Gun is null");
        }
    }
}
