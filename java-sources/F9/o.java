package F9;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o implements WildcardType, Type {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f2556t = new o(null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Type f2557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f2558s;

    public o(Type type, Type type2) {
        this.f2557r = type;
        this.f2558s = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2558s;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f2558s;
        if (type != null) {
            return "? super " + n.e(type);
        }
        Type type2 = this.f2557r;
        if (type2 == null || p251z9.j.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + n.e(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f2557r;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
