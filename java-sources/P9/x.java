package P9;

import K9.O;
import K9.P;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6811b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O[] f6812a;

    public final void a(O o10) {
        o10.e((P) this);
        O[] oArr = this.f6812a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6811b;
        if (oArr == null) {
            oArr = new O[4];
            this.f6812a = oArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= oArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(oArr, atomicIntegerFieldUpdater.get(this) * 2);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            oArr = (O[]) objArrCopyOf;
            this.f6812a = oArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        oArr[i10] = o10;
        o10.f5331s = i10;
        d(i10);
    }

    public final void b(O o10) {
        synchronized (this) {
            if (o10.b() != null) {
                c(o10.f5331s);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final O c(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f6812a;
        p251z9.j.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6811b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            e(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                O o10 = objArr2[i10];
                p251z9.j.b(o10);
                Object obj2 = objArr2[i14];
                p251z9.j.b(obj2);
                if (o10.compareTo(obj2) < 0) {
                    e(i10, i14);
                    d(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f6812a;
                        p251z9.j.b(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            p251z9.j.b(comparable3);
                            obj = objArr[i12];
                            p251z9.j.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        p251z9.j.b(comparable);
                        comparable2 = objArr[i13];
                        p251z9.j.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f6812a;
                    p251z9.j.b(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        p251z9.j.b(comparable3);
                        obj = objArr[i12];
                        p251z9.j.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    p251z9.j.b(comparable);
                    comparable2 = objArr[i13];
                    p251z9.j.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i10, i13);
                    i10 = i13;
                }
            }
        }
        O o11 = objArr2[atomicIntegerFieldUpdater.get(this)];
        p251z9.j.b(o11);
        o11.e(null);
        o11.f5331s = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return o11;
    }

    public final void d(int i10) {
        while (i10 > 0) {
            O[] oArr = this.f6812a;
            p251z9.j.b(oArr);
            int i11 = (i10 - 1) / 2;
            O o10 = oArr[i11];
            p251z9.j.b(o10);
            O o11 = oArr[i10];
            p251z9.j.b(o11);
            if (o10.compareTo(o11) <= 0) {
                return;
            }
            e(i10, i11);
            i10 = i11;
        }
    }

    public final void e(int i10, int i11) {
        O[] oArr = this.f6812a;
        p251z9.j.b(oArr);
        O o10 = oArr[i11];
        p251z9.j.b(o10);
        O o11 = oArr[i10];
        p251z9.j.b(o11);
        oArr[i10] = o10;
        oArr[i11] = o11;
        o10.f5331s = i10;
        o11.f5331s = i11;
    }
}
