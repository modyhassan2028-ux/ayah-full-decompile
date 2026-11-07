package q9;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p151p.S0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p150o9.c, d, Serializable {
    private final p150o9.c completion;

    public a(p150o9.c cVar) {
        this.completion = cVar;
    }

    public p150o9.c create(p150o9.c cVar) {
        j.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        p150o9.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final p150o9.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        S0 s10 = f.f21350b;
        S0 s11 = f.f21349a;
        if (s10 == null) {
            try {
                S0 s12 = new S0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f21350b = s12;
                s10 = s12;
            } catch (Exception unused2) {
                f.f21350b = s11;
                s10 = s11;
            }
        }
        if (s10 != s11 && (method = s10.f20582a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = s10.f20583b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = s10.f20584c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        p150o9.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            p150o9.c cVar2 = aVar.completion;
            j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == p161p9.a.f21156r) {
                    return;
                }
            } catch (Throwable th) {
                obj = p110k9.a.b(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public p150o9.c create(Object obj, p150o9.c cVar) {
        j.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
