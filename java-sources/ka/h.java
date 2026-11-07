package ka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19150a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f19152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f19153d;

    public i a() {
        return new i(this.f19150a, this.f19151b, (String[]) this.f19152c, (String[]) this.f19153d);
    }

    public void b(String... strArr) {
        p251z9.j.e(strArr, "cipherSuites");
        if (!this.f19150a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        p251z9.j.d(objArrCopyOf, "copyOf(...)");
        this.f19152c = (String[]) objArrCopyOf;
    }

    public void c(f... fVarArr) {
        p251z9.j.e(fVarArr, "cipherSuites");
        if (!this.f19150a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f19141a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        p251z9.j.e(strArr, "tlsVersions");
        if (!this.f19150a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        p251z9.j.d(objArrCopyOf, "copyOf(...)");
        this.f19153d = (String[]) objArrCopyOf;
    }

    public void e(y... yVarArr) {
        if (!this.f19150a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (y yVar : yVarArr) {
            arrayList.add(yVar.f19295r);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
