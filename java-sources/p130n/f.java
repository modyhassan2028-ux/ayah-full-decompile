package p130n;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class f implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Class[] f19740t = {MenuItem.class};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f19741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Method f19742s;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f19741r;
        Method method = this.f19742s;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
