package H1;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3245c;

    public c(int i10) {
        this.f3243a = 0;
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3244b = new Object[i10];
    }

    public Object a() {
        switch (this.f3243a) {
            case 0:
                int i10 = this.f3245c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object[] objArr = this.f3244b;
                Object obj = objArr[i11];
                j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i11] = null;
                this.f3245c--;
                return obj;
            default:
                int i12 = this.f3245c;
                if (i12 <= 0) {
                    return null;
                }
                int i13 = i12 - 1;
                Object[] objArr2 = this.f3244b;
                Object obj2 = objArr2[i13];
                objArr2[i13] = null;
                this.f3245c = i12 - 1;
                return obj2;
        }
    }

    public void b(p142o1.c cVar) {
        int i10 = this.f3245c;
        Object[] objArr = this.f3244b;
        if (i10 < objArr.length) {
            objArr[i10] = cVar;
            this.f3245c = i10 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z10;
        j.e(obj, "instance");
        int i10 = this.f3245c;
        int i11 = 0;
        while (true) {
            objArr = this.f3244b;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == obj) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f3245c;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = obj;
        this.f3245c = i12 + 1;
        return true;
    }

    public c() {
        this.f3243a = 1;
        this.f3244b = new Object[256];
    }
}
