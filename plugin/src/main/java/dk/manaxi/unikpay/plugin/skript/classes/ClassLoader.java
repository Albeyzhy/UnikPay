package dk.manaxi.unikpay.plugin.skript.classes;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.registrations.Classes;
import dk.manaxi.unikpay.api.classes.Pakke;

public class ClassLoader {

    static {
        Classes.registerClass(new ClassInfo<>(AcceptId.class, "id")
                .defaultExpression(new EventValueExpression<>(AcceptId.class))
                .user("id")
                .name("id")
                .description("betalings id")
                .parser(new Parser<AcceptId>() {
                    @Override
                    public AcceptId parse(String arg0, ParseContext arg1) {
                        return null;
                    }

                    @Override
                    public String toString(AcceptId arg0, int arg1) {
                        return arg0.toString();
                    }

                    @Override
                    public String toVariableNameString(AcceptId arg0) {
                        return arg0.toString();
                    }

                }));
        Classes.registerClass(new ClassInfo<>(Pakke.class, "pakke")
                .defaultExpression(new EventValueExpression<>(Pakke.class))
                .user("pakker?")
                .name("pakke")
                .description("pakke")
                .parser(new Parser<Pakke>() {
                    @Override
                    public Pakke parse(String arg0, ParseContext arg1) {
                        return null;
                    }

                    @Override
                    public String toString(Pakke arg0, int arg1) {
                        return arg0.toString();
                    }

                    @Override
                    public String toVariableNameString(Pakke arg0) {
                        return arg0.toString();
                    }

                }));
    }
}
