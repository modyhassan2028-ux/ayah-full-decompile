package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.InterfaceC1046b;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LocalDate f17896h = LocalDate.c0(2000, 1, 1);
    public final InterfaceC1046b g;

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        if (vVar.f17921c) {
            return super.b(vVar);
        }
        return false;
    }

    public o(TemporalField temporalField, int i10, int i11, InterfaceC1046b interfaceC1046b, int i12) {
        super(temporalField, i10, i11, F.NOT_NEGATIVE, i12);
        this.g = interfaceC1046b;
    }

    @Override // j$.time.format.i
    public final long a(y yVar, long j) {
        long jAbs = Math.abs(j);
        InterfaceC1046b interfaceC1046b = this.g;
        long j10 = interfaceC1046b != null ? j$.com.android.tools.r8.a.z(yVar.f17928a).C(interfaceC1046b).get(this.f17872a) : 0;
        long[] jArr = i.f17871f;
        if (j >= j10) {
            long j11 = jArr[this.f17873b];
            if (j < j10 + j11) {
                return jAbs % j11;
            }
        }
        return jAbs % jArr[this.f17874c];
    }

    @Override // j$.time.format.i
    public final int c(v vVar, long j, int i10, int i11) {
        final o oVar;
        final v vVar2;
        final long j10;
        final int i12;
        final int i13;
        int i14;
        long j11;
        InterfaceC1046b interfaceC1046b = this.g;
        if (interfaceC1046b != null) {
            j$.time.chrono.l lVar = vVar.c().f17843c;
            if (lVar == null && (lVar = vVar.f17919a.f17853e) == null) {
                lVar = j$.time.chrono.q.f17812c;
            }
            i14 = lVar.C(interfaceC1046b).get(this.f17872a);
            oVar = this;
            vVar2 = vVar;
            j10 = j;
            i12 = i10;
            i13 = i11;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.f17891a.c(vVar2, j10, i12, i13);
                }
            };
            if (vVar2.f17923e == null) {
                vVar2.f17923e = new ArrayList();
            }
            vVar2.f17923e.add(consumer);
        } else {
            oVar = this;
            vVar2 = vVar;
            j10 = j;
            i12 = i10;
            i13 = i11;
            i14 = 0;
        }
        int i15 = i13 - i12;
        int i16 = oVar.f17873b;
        if (i15 != i16 || j10 < 0) {
            j11 = j10;
        } else {
            long j12 = i.f17871f[i16];
            long j13 = i14;
            long j14 = j13 - (j13 % j12);
            long j15 = i14 > 0 ? j14 + j10 : j14 - j10;
            j11 = j15 < j13 ? j12 + j15 : j15;
        }
        return vVar2.f(oVar.f17872a, j11, i12, i13);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f17876e == -1) {
            return this;
        }
        return new o(this.f17872a, this.f17873b, this.f17874c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i10) {
        return new o(this.f17872a, this.f17873b, this.f17874c, this.g, this.f17876e + i10);
    }

    @Override // j$.time.format.i
    public final String toString() {
        Object objRequireNonNull = this.g;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + this.f17872a + "," + this.f17873b + "," + this.f17874c + "," + objRequireNonNull + ")";
    }
}
