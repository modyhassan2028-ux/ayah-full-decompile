package p024c3;

import R6.g;
import W.AbstractC0607v1;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Collection;
import p120l9.l;
import p120l9.r;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends B0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13450f;
    public final g g;

    public c(Object obj, String str, a aVar, int i10) {
        Collection collectionK;
        j.e(obj, "value");
        p123m2.c.z(i10, "verificationMode");
        this.f13448d = obj;
        this.f13449e = str;
        this.f13450f = i10;
        String strT = B0.c.t(obj, str);
        j.e(strT, "message");
        g gVar = new g(strT);
        StackTraceElement[] stackTrace = gVar.getStackTrace();
        j.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(a.B(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionK = r.f19440r;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionK = l.o0(stackTrace);
            } else if (length == 1) {
                collectionK = AbstractC0813f2.K(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i11 = length2 - length; i11 < length2; i11++) {
                    arrayList.add(stackTrace[i11]);
                }
                collectionK = arrayList;
            }
        }
        Object[] array = collectionK.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        gVar.setStackTrace((StackTraceElement[]) array);
        this.g = gVar;
    }

    @Override // B0.c
    public final Object p() throws g {
        int iB = AbstractC0607v1.b(this.f13450f);
        if (iB == 0) {
            throw this.g;
        }
        if (iB != 1) {
            if (iB == 2) {
                return null;
            }
            throw new A6.a();
        }
        String strT = B0.c.t(this.f13448d, this.f13449e);
        j.e(strT, "message");
        Log.d("p", strT);
        return null;
    }

    @Override // B0.c
    public final B0.c Z(String str, p241y9.c cVar) {
        return this;
    }
}
