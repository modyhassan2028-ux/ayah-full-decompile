package F9;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Type f2538r;

    public a(Type type) {
        p251z9.j.e(type, "elementType");
        this.f2538r = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return p251z9.j.a(this.f2538r, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f2538r;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return n.e(this.f2538r) + "[]";
    }

    public final int hashCode() {
        return this.f2538r.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
