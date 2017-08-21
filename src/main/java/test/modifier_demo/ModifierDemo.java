package test.modifier_demo;

import test.DifferentAccessModifier;

/**
 * Created by LeeToSun on 2017/8/21 0021
 */
public class ModifierDemo {

    public static void main(String[] args) {
        DifferentAccessModifier.sPrivate;
        DifferentAccessModifier.sProtected = "";
        DifferentAccessModifier.sPublic = "";
        DifferentAccessModifier.sDefault = "";
        DifferentAccessModifier.mPrivate();
        DifferentAccessModifier.mProtected();
        DifferentAccessModifier.mPublic();
        DifferentAccessModifier.mDefault();
    }

}
