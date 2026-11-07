package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1350e f10380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1350e f10381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1350e f10382c;

    public b(C1350e c1350e, C1350e c1350e2, C1350e c1350e3) {
        this.f10380a = c1350e;
        this.f10381b = c1350e2;
        this.f10382c = c1350e3;
    }

    public abstract c a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1350e c1350e = this.f10382c;
        Class cls2 = (Class) c1350e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1350e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C1350e c1350e = this.f10380a;
        Method method = (Method) c1350e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        c1350e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C1350e c1350e = this.f10381b;
        Method method = (Method) c1350e.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, b.class);
        c1350e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i10);

    public final int f(int i10, int i11) {
        return !e(i11) ? i10 : ((c) this).f10384e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i10) {
        if (!e(i10)) {
            return parcelable;
        }
        return ((c) this).f10384e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String string = ((c) this).f10384e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (d) c(string).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void i(int i10);

    public final void j(int i10, int i11) {
        i(i11);
        ((c) this).f10384e.writeInt(i10);
    }

    public final void k(Parcelable parcelable, int i10) {
        i(i10);
        ((c) this).f10384e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f10384e.writeString(null);
            return;
        }
        try {
            ((c) this).f10384e.writeString(b(dVar.getClass()).getName());
            c cVarA = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, cVarA);
                Parcel parcel = cVarA.f10384e;
                int i10 = cVarA.f10387i;
                if (i10 >= 0) {
                    int i11 = cVarA.f10383d.get(i10);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(iDataPosition - i11);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
