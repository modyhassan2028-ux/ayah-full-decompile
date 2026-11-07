package a7;

import U6.y;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p038d7.a implements a {
    public final Object g;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.g = obj;
    }

    public static a F0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object G0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).g;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(p123m2.c.r(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        y.f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
