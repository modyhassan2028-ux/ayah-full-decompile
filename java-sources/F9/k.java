package F9;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ParameterizedType, Type {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f2546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f2547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type[] f2548t;

    public k(Class cls, Type type, ArrayList arrayList) {
        this.f2546r = cls;
        this.f2547s = type;
        this.f2548t = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return p251z9.j.a(this.f2546r, parameterizedType.getRawType()) && p251z9.j.a(this.f2547s, parameterizedType.getOwnerType()) && Arrays.equals(this.f2548t, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f2548t;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f2547s;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f2546r;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f2546r;
        Type type = this.f2547s;
        if (type != null) {
            sb.append(n.e(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(n.e(cls));
        }
        Type[] typeArr = this.f2548t;
        if (typeArr.length != 0) {
            p120l9.l.m0(typeArr, sb, ", ", "<", ">", "...", j.f2545z);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f2546r.hashCode();
        Type type = this.f2547s;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f2548t);
    }

    public final String toString() {
        return getTypeName();
    }
}
