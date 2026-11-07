package V8;

import com.google.android.gms.internal.measurement.B1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Type f8420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f8421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type[] f8422t;

    public b(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || B1.F(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f8420r = type == null ? null : d.a(type);
        this.f8421s = d.a(type2);
        this.f8422t = (Type[]) typeArr.clone();
        int i10 = 0;
        while (true) {
            Type[] typeArr2 = this.f8422t;
            if (i10 >= typeArr2.length) {
                return;
            }
            typeArr2[i10].getClass();
            d.b(this.f8422t[i10]);
            Type[] typeArr3 = this.f8422t;
            typeArr3[i10] = d.a(typeArr3[i10]);
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && B1.w(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f8422t.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f8420r;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f8421s;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f8422t) ^ this.f8421s.hashCode();
        Set set = d.f8425a;
        Type type = this.f8420r;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f8422t;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(d.i(this.f8421s));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(d.i(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb.append(", ");
            sb.append(d.i(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
