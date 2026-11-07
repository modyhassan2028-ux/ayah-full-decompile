package dev.zacsweers.moshix.adapters;

import Da.h;
import Da.k;
import Da.t;
import android.support.v4.media.session.p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.o;
import com.squareup.moshi.q;
import com.squareup.moshi.r;
import com.squareup.moshi.s;
import java.io.IOException;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class JsonString$Factory$JsonStringJsonAdapter extends JsonAdapter<String> {
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) throws IOException {
        int i10;
        t tVarP;
        j.e(nVar, "reader");
        o oVar = (o) nVar;
        int iF0 = oVar.f15464y;
        if (iF0 == 0) {
            iF0 = oVar.f0();
        }
        h hVar = new h();
        k kVar = r.f15473D;
        try {
            if (iF0 != 3) {
                if (iF0 == 1) {
                    hVar.d0("{");
                    kVar = r.f15474y;
                } else {
                    if (iF0 == 9) {
                        hVar.d0("\"");
                        kVar = r.f15470A;
                    } else if (iF0 == 8) {
                        hVar.d0("'");
                        kVar = r.f15475z;
                    } else if (iF0 == 17 || iF0 == 16 || iF0 == 10) {
                        hVar.d0(oVar.L());
                    } else if (iF0 == 5) {
                        hVar.d0("true");
                    } else if (iF0 == 6) {
                        hVar.d0("false");
                    } else if (iF0 == 7) {
                        hVar.d0("null");
                    } else {
                        if (iF0 != 11) {
                            throw new A6.a("Expected a value but was " + p.G(oVar.N()) + " at path " + oVar.s());
                        }
                        String strL = oVar.L();
                        q qVar = new q(hVar);
                        try {
                            qVar.N(strL);
                            qVar.close();
                        } catch (Throwable th) {
                            try {
                                qVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    i10 = 0;
                }
                if (oVar.f15464y != 0) {
                    int[] iArr = oVar.f15452u;
                    int i11 = oVar.f15449r - 1;
                    iArr[i11] = iArr[i11] + 1;
                    oVar.f15464y = 0;
                }
                oVar.f15461C = new r(oVar.f15462w, hVar, kVar, i10);
                oVar.O(9);
                tVarP = Y2.a.p(oVar.f15461C);
                h hVar2 = tVarP.f1393s;
                hVar2.W(tVarP.f1392r);
                String strE = hVar2.E();
                tVarP.close();
                return strE;
            }
            hVar.d0("[");
            kVar = r.f15474y;
            h hVar3 = tVarP.f1393s;
            hVar3.W(tVarP.f1392r);
            String strE2 = hVar3.E();
            tVarP.close();
            return strE2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p181s2.o.e(tVarP, th3);
                throw th4;
            }
        }
        i10 = 1;
        if (oVar.f15464y != 0) {
            int[] iArr2 = oVar.f15452u;
            int i12 = oVar.f15449r - 1;
            iArr2[i12] = iArr2[i12] + 1;
            oVar.f15464y = 0;
        }
        oVar.f15461C = new r(oVar.f15462w, hVar, kVar, i10);
        oVar.O(9);
        tVarP = Y2.a.p(oVar.f15461C);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) throws Throwable {
        String str = (String) obj;
        j.e(sVar, "writer");
        q qVar = (q) sVar;
        if (qVar.f15488w) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + qVar.n());
        }
        qVar.d0();
        qVar.V();
        int[] iArr = qVar.f15484s;
        int i10 = qVar.f15483r;
        qVar.f15483r = i10 + 1;
        iArr[i10] = 9;
        Da.s sVarO = Y2.a.o(new com.squareup.moshi.p(qVar));
        try {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            sVarO.T(str);
            sVarO.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p181s2.o.e(sVarO, th);
                throw th2;
            }
        }
    }
}
