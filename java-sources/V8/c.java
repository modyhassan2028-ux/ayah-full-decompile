package V8;

import com.google.android.gms.internal.measurement.B1;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Type f8423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f8424s;

    public c(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            d.b(typeArr[0]);
            this.f8424s = null;
            this.f8423r = d.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        d.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f8424s = d.a(typeArr2[0]);
        this.f8423r = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && B1.w(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f8424s;
        return type != null ? new Type[]{type} : d.f8426b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f8423r};
    }

    public final int hashCode() {
        Type type = this.f8424s;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f8423r.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f8424s;
        if (type != null) {
            return "? super " + d.i(type);
        }
        Type type2 = this.f8423r;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.i(type2);
    }
}
