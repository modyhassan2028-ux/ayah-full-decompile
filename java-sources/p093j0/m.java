package p093j0;

import A9.a;
import Z0.B;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import p120l9.l;
import p120l9.n;
import u.v;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f18655v = new m(0, 0, 0, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f18656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f18657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f18658t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long[] f18659u;

    public m(long j, long j10, long j11, long[] jArr) {
        this.f18656r = j;
        this.f18657s = j10;
        this.f18658t = j11;
        this.f18659u = jArr;
    }

    public final m b(m mVar) {
        m mVarC;
        long[] jArr;
        m mVar2 = f18655v;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar2;
        }
        long j = mVar.f18658t;
        long j10 = mVar.f18658t;
        long[] jArr2 = mVar.f18659u;
        long j11 = mVar.f18657s;
        long j12 = mVar.f18656r;
        long j13 = this.f18658t;
        if (j == j13 && jArr2 == (jArr = this.f18659u)) {
            return new m(this.f18656r & (~j12), this.f18657s & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            mVarC = this;
            for (long j14 : jArr2) {
                mVarC = mVarC.c(j14);
            }
        } else {
            mVarC = this;
        }
        long j15 = 0;
        if (j11 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j11) != j15) {
                    mVarC = mVarC.c(((long) i10) + j10);
                }
                i10++;
                j15 = j15;
            }
        }
        long j16 = j15;
        if (j12 != j16) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != j16) {
                    mVarC = mVarC.c(((long) i11) + j10 + ((long) 64));
                }
            }
        }
        return mVarC;
    }

    public final m c(long j) {
        long[] jArr;
        int iB;
        long[] jArr2;
        long j10 = this.f18658t;
        long j11 = j - j10;
        if (j11 >= 0 && j11 < 64) {
            long j12 = 1 << ((int) j11);
            long j13 = this.f18657s;
            if ((j13 & j12) != 0) {
                return new m(this.f18656r, j13 & (~j12), j10, this.f18659u);
            }
        } else if (j11 >= 64 && j11 < 128) {
            long j14 = 1 << (((int) j11) - 64);
            long j15 = this.f18656r;
            if ((j15 & j14) != 0) {
                return new m(j15 & (~j14), this.f18657s, j10, this.f18659u);
            }
        } else if (j11 < 0 && (jArr = this.f18659u) != null && (iB = s.b(jArr, j)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iB > 0) {
                    l.Z(jArr, jArr3, 0, 0, iB);
                }
                if (iB < i10) {
                    l.Z(jArr, jArr3, iB, iB + 1, length);
                }
                jArr2 = jArr3;
            }
            return new m(this.f18656r, this.f18657s, this.f18658t, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j10 = j - this.f18658t;
        if (j10 >= 0 && j10 < 64) {
            return ((1 << ((int) j10)) & this.f18657s) != 0;
        }
        if (j10 < 64 || j10 >= 128) {
            return j10 <= 0 && (jArr = this.f18659u) != null && s.b(jArr, j) >= 0;
        }
        return ((1 << (((int) j10) + (-64))) & this.f18656r) != 0;
    }

    public final m e(m mVar) {
        m mVarF;
        m mVarF2;
        long[] jArr;
        m mVar2 = f18655v;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar;
        }
        long j = mVar.f18658t;
        long j10 = mVar.f18658t;
        long[] jArr2 = mVar.f18659u;
        long j11 = mVar.f18657s;
        long j12 = mVar.f18656r;
        long j13 = this.f18658t;
        long j14 = this.f18657s;
        long j15 = this.f18656r;
        if (j == j13 && jArr2 == (jArr = this.f18659u)) {
            return new m(j15 | j12, j14 | j11, j13, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f18659u;
        if (jArr3 != null) {
            if (jArr2 != null) {
                mVarF = this;
                for (long j16 : jArr2) {
                    mVarF = mVarF.f(j16);
                }
            } else {
                mVarF = this;
            }
            if (j11 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j11) != 0) {
                        mVarF = mVarF.f(((long) i11) + j10);
                    }
                }
            }
            if (j12 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j12) != 0) {
                        mVarF = mVarF.f(((long) i10) + j10 + ((long) 64));
                    }
                    i10++;
                }
            }
            return mVarF;
        }
        if (jArr3 != null) {
            mVarF2 = mVar;
            for (long j17 : jArr3) {
                mVarF2 = mVarF2.f(j17);
            }
        } else {
            mVarF2 = mVar;
        }
        long j18 = this.f18658t;
        if (j14 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != 0) {
                    mVarF2 = mVarF2.f(((long) i12) + j18);
                }
            }
        }
        if (j15 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j15) != 0) {
                    mVarF2 = mVarF2.f(((long) i10) + j18 + ((long) 64));
                }
                i10++;
            }
        }
        return mVarF2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    public final m f(long j) {
        long j10;
        long[] jArr;
        long j11;
        long[] jArr2;
        long[] jArr3;
        long j12 = this.f18658t;
        long j13 = j - j12;
        long j14 = this.f18656r;
        long j15 = this.f18657s;
        long[] jArr4 = this.f18659u;
        if (j13 < 0 || j13 >= 64) {
            int i10 = 64;
            if (j13 >= 64 && j13 < 128) {
                long j16 = 1 << (((int) j13) - 64);
                if ((j14 & j16) == 0) {
                    return new m(j16 | j14, j15, j12, jArr4);
                }
            } else if (j13 < 128) {
                if (jArr4 == null) {
                    return new m(j14, j15, j12, new long[]{j});
                }
                int iB = s.b(jArr4, j);
                if (iB < 0) {
                    int i11 = -(iB + 1);
                    int length = jArr4.length;
                    long[] jArr5 = new long[length + 1];
                    l.Z(jArr4, jArr5, 0, 0, i11);
                    l.Z(jArr4, jArr5, i11 + 1, i11, length);
                    jArr5[i11] = j;
                    return new m(this.f18656r, this.f18657s, this.f18658t, jArr5);
                }
            } else if (!d(j)) {
                long j17 = 64;
                long j18 = ((j + 1) / j17) * j17;
                if (j18 < 0) {
                    j18 = 9223372036854775680L;
                }
                long j19 = this.f18658t;
                long j20 = j14;
                B b5 = null;
                while (true) {
                    if (j19 >= j18) {
                        j10 = j19;
                        jArr = jArr4;
                        j11 = j15;
                        break;
                    }
                    if (j15 != 0) {
                        if (b5 == null) {
                            b5 = new B(jArr4);
                        }
                        int i12 = 0;
                        while (i12 < i10) {
                            if ((j15 & (1 << i12)) != 0) {
                                ((v) b5.f10875s).a(((long) i12) + j19);
                            }
                            i12++;
                            jArr4 = jArr4;
                            i10 = 64;
                        }
                    }
                    long[] jArr6 = jArr4;
                    if (j20 == 0) {
                        j10 = j18;
                        j11 = 0;
                        jArr = jArr6;
                        break;
                    }
                    j19 += j17;
                    jArr4 = jArr6;
                    j15 = j20;
                    i10 = 64;
                    j20 = 0;
                }
                if (b5 == null) {
                    jArr2 = jArr;
                } else {
                    v vVar = (v) b5.f10875s;
                    int i13 = vVar.f22766b;
                    if (i13 == 0) {
                        jArr3 = null;
                    } else {
                        jArr3 = new long[i13];
                        long[] jArr7 = vVar.f22765a;
                        for (int i14 = 0; i14 < i13; i14++) {
                            jArr3[i14] = jArr7[i14];
                        }
                    }
                    if (jArr3 == null) {
                        jArr2 = jArr;
                    } else {
                        jArr2 = jArr3;
                    }
                }
                return new m(j20, j11, j10, jArr2).f(j);
            }
        } else {
            long j21 = 1 << ((int) j13);
            if ((j15 & j21) == 0) {
                return new m(j14, j15 | j21, j12, jArr4);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0813f2.I(new l(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(n.a0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
