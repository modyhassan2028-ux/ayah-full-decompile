package p020c;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class t extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t f13400r = new t(0);

    @Override // p241y9.a
    public final Object invoke() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new v(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return u.f13401a;
        }
    }
}
