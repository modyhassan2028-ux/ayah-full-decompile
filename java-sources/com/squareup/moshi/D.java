package com.squareup.moshi;

import androidx.datastore.preferences.protobuf.C0736j;
import java.io.EOFException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class D extends JsonAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15418a;

    public /* synthetic */ D(int i10) {
        this.f15418a = i10;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) throws C0736j, EOFException {
        long jLongValueExact;
        switch (this.f15418a) {
            case 0:
                return nVar.L();
            case 1:
                return Boolean.valueOf(nVar.A());
            case 2:
                return Byte.valueOf((byte) E.a(nVar, "a byte", -128, 255));
            case 3:
                String strL = nVar.L();
                if (strL.length() <= 1) {
                    return Character.valueOf(strL.charAt(0));
                }
                throw new A6.a("Expected a char but was " + p245z2.a.A('\"', "\"", strL) + " at path " + nVar.s());
            case 4:
                return Double.valueOf(nVar.E());
            case 5:
                float fE = (float) nVar.E();
                if (nVar.f15453v || !Float.isInfinite(fE)) {
                    return Float.valueOf(fE);
                }
                throw new A6.a("JSON forbids NaN and infinities: " + fE + " at path " + nVar.s());
            case 6:
                return Integer.valueOf(nVar.F());
            case 7:
                o oVar = (o) nVar;
                int iF0 = oVar.f15464y;
                if (iF0 == 0) {
                    iF0 = oVar.f0();
                }
                if (iF0 != 16) {
                    if (iF0 == 17) {
                        Da.h hVar = oVar.f15463x;
                        long j = oVar.f15459A;
                        hVar.getClass();
                        oVar.f15460B = hVar.A(j, H9.a.f3610a);
                    } else if (iF0 == 9 || iF0 == 8) {
                        String strL0 = iF0 == 9 ? oVar.l0(o.f15455E) : oVar.l0(o.f15454D);
                        oVar.f15460B = strL0;
                        try {
                            jLongValueExact = Long.parseLong(strL0);
                            oVar.f15464y = 0;
                            int[] iArr = oVar.f15452u;
                            int i10 = oVar.f15449r - 1;
                            iArr[i10] = iArr[i10] + 1;
                        } catch (NumberFormatException unused) {
                            oVar.f15464y = 11;
                            jLongValueExact = new BigDecimal(oVar.f15460B).longValueExact();
                            oVar.f15460B = null;
                            oVar.f15464y = 0;
                            int[] iArr2 = oVar.f15452u;
                            int i11 = oVar.f15449r - 1;
                            iArr2[i11] = iArr2[i11] + 1;
                        }
                    } else if (iF0 != 11) {
                        throw new A6.a("Expected a long but was " + android.support.v4.media.session.p.G(oVar.N()) + " at path " + oVar.s());
                    }
                    oVar.f15464y = 11;
                    try {
                        jLongValueExact = new BigDecimal(oVar.f15460B).longValueExact();
                        oVar.f15460B = null;
                        oVar.f15464y = 0;
                        int[] iArr3 = oVar.f15452u;
                        int i12 = oVar.f15449r - 1;
                        iArr3[i12] = iArr3[i12] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new A6.a("Expected a long but was " + oVar.f15460B + " at path " + oVar.s());
                    }
                    break;
                } else {
                    oVar.f15464y = 0;
                    int[] iArr4 = oVar.f15452u;
                    int i13 = oVar.f15449r - 1;
                    iArr4[i13] = iArr4[i13] + 1;
                    jLongValueExact = oVar.f15465z;
                }
                return Long.valueOf(jLongValueExact);
            default:
                return Short.valueOf((short) E.a(nVar, "a short", -32768, 32767));
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        switch (this.f15418a) {
            case 0:
                sVar.N((String) obj);
                break;
            case 1:
                sVar.O(((Boolean) obj).booleanValue());
                break;
            case 2:
                sVar.H(((Byte) obj).intValue() & 255);
                break;
            case 3:
                sVar.N(((Character) obj).toString());
                break;
            case 4:
                sVar.F(((Double) obj).doubleValue());
                break;
            case 5:
                Float f3 = (Float) obj;
                f3.getClass();
                sVar.L(f3);
                break;
            case 6:
                sVar.H(((Integer) obj).intValue());
                break;
            case 7:
                sVar.H(((Long) obj).longValue());
                break;
            default:
                sVar.H(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.f15418a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
