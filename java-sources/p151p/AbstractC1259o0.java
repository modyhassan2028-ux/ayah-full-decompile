package p151p;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: p.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1259o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f20751a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f20751a = declaredField;
    }
}
