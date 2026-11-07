package p020c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class v extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f13402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f13403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f13404c;

    public v(Field field, Field field2, Field field3) {
        this.f13402a = field;
        this.f13403b = field2;
        this.f13404c = field3;
    }

    @Override // p020c.s
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f13404c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // p020c.s
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f13402a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // p020c.s
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f13403b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
