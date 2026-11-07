package p151p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1253l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f20718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f20719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f20720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20721d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f20718a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f20719b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f20720c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f20721d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
