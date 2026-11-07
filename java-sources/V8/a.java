package V8;

import com.google.android.gms.internal.measurement.B1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Type f8419r;

    public a(Type type) {
        this.f8419r = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && B1.w(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f8419r;
    }

    public final int hashCode() {
        return this.f8419r.hashCode();
    }

    public final String toString() {
        return d.i(this.f8419r) + "[]";
    }
}
