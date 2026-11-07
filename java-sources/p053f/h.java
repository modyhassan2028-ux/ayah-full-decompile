package p053f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i7.C0972d;
import i7.C0975e;
import i7.C0987i;
import i7.C1019t;
import i7.C1022u;
import i7.F1;
import i7.I1;
import i7.J1;
import i7.K1;
import i7.S1;
import i7.X1;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.Locale;
import p000a.a;
import p017b7.g;
import p056f2.C0929b;
import p056f2.C0930c;
import p056f2.G;
import p056f2.M;
import p056f2.P;
import p056f2.S;
import p151p.C1248j;
import p151p.J;
import p159p7.b;
import p226x2.d;
import p226x2.f;
import p226x2.n;
import p226x2.x;
import p226x2.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15883a;

    public /* synthetic */ h(int i10) {
        this.f15883a = i10;
    }

    public static void a(C1022u c1022u, Parcel parcel, int i10) {
        String str = c1022u.f17558r;
        int iD0 = g.D0(parcel, 20293);
        g.z0(parcel, 2, str);
        g.y0(parcel, 3, c1022u.f17559s, i10);
        g.z0(parcel, 4, c1022u.f17560t);
        long j = c1022u.f17561u;
        g.G0(parcel, 5, 8);
        parcel.writeLong(j);
        g.F0(parcel, iD0);
    }

    public static void b(S1 s10, Parcel parcel) {
        int i10 = s10.f17131r;
        int iD0 = g.D0(parcel, 20293);
        g.G0(parcel, 1, 4);
        parcel.writeInt(i10);
        g.z0(parcel, 2, s10.f17132s);
        long j = s10.f17133t;
        g.G0(parcel, 3, 8);
        parcel.writeLong(j);
        Long l10 = s10.f17134u;
        if (l10 != null) {
            g.G0(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        g.z0(parcel, 6, s10.f17135v);
        g.z0(parcel, 7, s10.f17136w);
        Double d5 = s10.f17137x;
        if (d5 != null) {
            g.G0(parcel, 8, 8);
            parcel.writeDouble(d5.doubleValue());
        }
        g.F0(parcel, iD0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15883a) {
            case 0:
                j.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(parcelable);
                return new i((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 1:
                return new C0929b(parcel);
            case 2:
                return new C0930c(parcel);
            case 3:
                G g = new G();
                g.f15941r = parcel.readString();
                g.f15942s = parcel.readInt();
                return g;
            case 4:
                M m10 = new M();
                m10.f15990v = null;
                m10.f15991w = new ArrayList();
                m10.f15992x = new ArrayList();
                m10.f15986r = parcel.createStringArrayList();
                m10.f15987s = parcel.createStringArrayList();
                m10.f15988t = (C0929b[]) parcel.createTypedArray(C0929b.CREATOR);
                m10.f15989u = parcel.readInt();
                m10.f15990v = parcel.readString();
                m10.f15991w = parcel.createStringArrayList();
                m10.f15992x = parcel.createTypedArrayList(C0930c.CREATOR);
                m10.f15993y = parcel.createTypedArrayList(G.CREATOR);
                return m10;
            case 5:
                return new P(parcel);
            case 6:
                S s10 = new S(parcel);
                s10.f16020r = parcel.readString();
                return s10;
            case 7:
                int iP0 = a.p0(parcel);
                long jH0 = 0;
                long jH1 = 0;
                int iG0 = 0;
                while (parcel.dataPosition() < iP0) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        jH0 = a.h0(parcel, i10);
                    } else if (c10 == 2) {
                        iG0 = a.g0(parcel, i10);
                    } else if (c10 != 3) {
                        a.k0(parcel, i10);
                    } else {
                        jH1 = a.h0(parcel, i10);
                    }
                }
                a.C(parcel, iP0);
                return new C0972d(iG0, jH0, jH1);
            case 8:
                int iP1 = a.p0(parcel);
                String strV = null;
                String strV2 = null;
                S1 s11 = null;
                String strV3 = null;
                C1022u c1022u = null;
                C1022u c1022u2 = null;
                C1022u c1022u3 = null;
                long jH2 = 0;
                long jH3 = 0;
                long jH4 = 0;
                boolean zD0 = false;
                while (parcel.dataPosition() < iP1) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strV = a.v(parcel, i11);
                            break;
                        case 3:
                            strV2 = a.v(parcel, i11);
                            break;
                        case 4:
                            s11 = (S1) a.u(parcel, i11, S1.CREATOR);
                            break;
                        case 5:
                            jH2 = a.h0(parcel, i11);
                            break;
                        case 6:
                            zD0 = a.d0(parcel, i11);
                            break;
                        case 7:
                            strV3 = a.v(parcel, i11);
                            break;
                        case '\b':
                            c1022u = (C1022u) a.u(parcel, i11, C1022u.CREATOR);
                            break;
                        case '\t':
                            jH3 = a.h0(parcel, i11);
                            break;
                        case '\n':
                            c1022u2 = (C1022u) a.u(parcel, i11, C1022u.CREATOR);
                            break;
                        case 11:
                            jH4 = a.h0(parcel, i11);
                            break;
                        case '\f':
                            c1022u3 = (C1022u) a.u(parcel, i11, C1022u.CREATOR);
                            break;
                        default:
                            a.k0(parcel, i11);
                            break;
                    }
                }
                a.C(parcel, iP1);
                return new C0975e(strV, strV2, s11, jH2, zD0, strV3, c1022u, jH3, c1022u2, jH4, c1022u3);
            case 9:
                int iP2 = a.p0(parcel);
                Bundle bundleS = null;
                while (parcel.dataPosition() < iP2) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        a.k0(parcel, i12);
                    } else {
                        bundleS = a.s(parcel, i12);
                    }
                }
                a.C(parcel, iP2);
                return new C0987i(bundleS);
            case 10:
                int iP3 = a.p0(parcel);
                Bundle bundleS2 = null;
                while (parcel.dataPosition() < iP3) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        a.k0(parcel, i13);
                    } else {
                        bundleS2 = a.s(parcel, i13);
                    }
                }
                a.C(parcel, iP3);
                return new C1019t(bundleS2);
            case 11:
                int iP4 = a.p0(parcel);
                long jH5 = 0;
                String strV4 = null;
                C1019t c1019t = null;
                String strV5 = null;
                while (parcel.dataPosition() < iP4) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 2) {
                        strV4 = a.v(parcel, i14);
                    } else if (c11 == 3) {
                        c1019t = (C1019t) a.u(parcel, i14, C1019t.CREATOR);
                    } else if (c11 == 4) {
                        strV5 = a.v(parcel, i14);
                    } else if (c11 != 5) {
                        a.k0(parcel, i14);
                    } else {
                        jH5 = a.h0(parcel, i14);
                    }
                }
                a.C(parcel, iP4);
                return new C1022u(strV4, c1019t, strV5, jH5);
            case 12:
                int iP5 = a.p0(parcel);
                int iG1 = 0;
                long jH6 = 0;
                String strV6 = null;
                while (parcel.dataPosition() < iP5) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strV6 = a.v(parcel, i15);
                    } else if (c12 == 2) {
                        jH6 = a.h0(parcel, i15);
                    } else if (c12 != 3) {
                        a.k0(parcel, i15);
                    } else {
                        iG1 = a.g0(parcel, i15);
                    }
                }
                a.C(parcel, iP5);
                return new F1(jH6, iG1, strV6);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                int iP6 = a.p0(parcel);
                byte[] bArr = null;
                String strV7 = null;
                Bundle bundleS3 = null;
                String strV8 = null;
                long jH7 = 0;
                long jH8 = 0;
                int iG2 = 0;
                while (parcel.dataPosition() < iP6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            jH7 = a.h0(parcel, i16);
                            break;
                        case 2:
                            int iI0 = a.i0(parcel, i16);
                            int iDataPosition = parcel.dataPosition();
                            if (iI0 == 0) {
                                bArr = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iI0);
                                bArr = bArrCreateByteArray;
                            }
                            break;
                        case 3:
                            strV7 = a.v(parcel, i16);
                            break;
                        case 4:
                            bundleS3 = a.s(parcel, i16);
                            break;
                        case 5:
                            iG2 = a.g0(parcel, i16);
                            break;
                        case 6:
                            jH8 = a.h0(parcel, i16);
                            break;
                        case 7:
                            strV8 = a.v(parcel, i16);
                            break;
                        default:
                            a.k0(parcel, i16);
                            break;
                    }
                }
                a.C(parcel, iP6);
                return new I1(jH7, bArr, strV7, bundleS3, iG2, jH8, strV8);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                int iP7 = a.p0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iP7) {
                            a.C(parcel, iP7);
                            return new J1(arrayList);
                        }
                        int i17 = parcel.readInt();
                        if (((char) i17) != 1) {
                            a.k0(parcel, i17);
                        } else {
                            int iI1 = a.i0(parcel, i17);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iI1 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i18 = parcel.readInt();
                            for (int i19 = 0; i19 < i18; i19++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iI1);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                int iP8 = a.p0(parcel);
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iP8) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        a.k0(parcel, i20);
                    } else {
                        arrayListX = a.x(parcel, i20, I1.CREATOR);
                    }
                }
                a.C(parcel, iP8);
                return new K1(arrayListX);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int iP9 = a.p0(parcel);
                String strV9 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strV10 = null;
                String strV11 = null;
                Double dValueOf = null;
                long jH9 = 0;
                int iG3 = 0;
                while (parcel.dataPosition() < iP9) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iG3 = a.g0(parcel, i21);
                            break;
                        case 2:
                            strV9 = a.v(parcel, i21);
                            break;
                        case 3:
                            jH9 = a.h0(parcel, i21);
                            break;
                        case 4:
                            int iI2 = a.i0(parcel, i21);
                            if (iI2 == 0) {
                                lValueOf = null;
                            } else {
                                a.s0(parcel, iI2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iI3 = a.i0(parcel, i21);
                            if (iI3 == 0) {
                                fValueOf = null;
                            } else {
                                a.s0(parcel, iI3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strV10 = a.v(parcel, i21);
                            break;
                        case 7:
                            strV11 = a.v(parcel, i21);
                            break;
                        case '\b':
                            int iI4 = a.i0(parcel, i21);
                            if (iI4 == 0) {
                                dValueOf = null;
                            } else {
                                a.s0(parcel, iI4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            a.k0(parcel, i21);
                            break;
                    }
                }
                a.C(parcel, iP9);
                return new S1(iG3, strV9, jH9, lValueOf, fValueOf, strV10, strV11, dValueOf);
            case 17:
                int iP10 = a.p0(parcel);
                boolean zD1 = false;
                int iG4 = 0;
                boolean zD2 = false;
                boolean zD3 = false;
                int iG5 = 0;
                int iG6 = 0;
                long jH10 = 0;
                long jH11 = 0;
                long jH12 = 0;
                long jH13 = 0;
                long jH14 = 0;
                long jH15 = 0;
                long jH16 = 0;
                String strV12 = "";
                String strV13 = strV12;
                String strV14 = strV13;
                String strV15 = strV14;
                String strV16 = null;
                String strV17 = null;
                String strV18 = null;
                String strV19 = null;
                String strV20 = null;
                String strV21 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strV22 = null;
                String strV23 = null;
                int iG7 = 100;
                boolean zD4 = true;
                boolean zD5 = true;
                long jH17 = -2147483648L;
                while (parcel.dataPosition() < iP10) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strV16 = a.v(parcel, i22);
                            break;
                        case 3:
                            strV17 = a.v(parcel, i22);
                            break;
                        case 4:
                            strV18 = a.v(parcel, i22);
                            break;
                        case 5:
                            strV19 = a.v(parcel, i22);
                            break;
                        case 6:
                            jH10 = a.h0(parcel, i22);
                            break;
                        case 7:
                            jH11 = a.h0(parcel, i22);
                            break;
                        case '\b':
                            strV20 = a.v(parcel, i22);
                            break;
                        case '\t':
                            zD4 = a.d0(parcel, i22);
                            break;
                        case '\n':
                            zD1 = a.d0(parcel, i22);
                            break;
                        case 11:
                            jH17 = a.h0(parcel, i22);
                            break;
                        case '\f':
                            strV21 = a.v(parcel, i22);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        case 17:
                        case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            a.k0(parcel, i22);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                            jH12 = a.h0(parcel, i22);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                            iG4 = a.g0(parcel, i22);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                            zD5 = a.d0(parcel, i22);
                            break;
                        case 18:
                            zD2 = a.d0(parcel, i22);
                            break;
                        case 21:
                            int iI5 = a.i0(parcel, i22);
                            if (iI5 == 0) {
                                boolValueOf = null;
                            } else {
                                a.s0(parcel, iI5, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jH13 = a.h0(parcel, i22);
                            break;
                        case 23:
                            int iI6 = a.i0(parcel, i22);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iI6 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iI6);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strV12 = a.v(parcel, i22);
                            break;
                        case 26:
                            strV13 = a.v(parcel, i22);
                            break;
                        case 27:
                            strV22 = a.v(parcel, i22);
                            break;
                        case 28:
                            zD3 = a.d0(parcel, i22);
                            break;
                        case 29:
                            jH14 = a.h0(parcel, i22);
                            break;
                        case 30:
                            iG7 = a.g0(parcel, i22);
                            break;
                        case 31:
                            strV14 = a.v(parcel, i22);
                            break;
                        case ' ':
                            iG5 = a.g0(parcel, i22);
                            break;
                        case '\"':
                            jH15 = a.h0(parcel, i22);
                            break;
                        case '#':
                            strV23 = a.v(parcel, i22);
                            break;
                        case '$':
                            strV15 = a.v(parcel, i22);
                            break;
                        case '%':
                            jH16 = a.h0(parcel, i22);
                            break;
                        case '&':
                            iG6 = a.g0(parcel, i22);
                            break;
                    }
                }
                a.C(parcel, iP10);
                return new X1(strV16, strV17, strV18, strV19, jH10, jH11, strV20, zD4, zD1, jH17, strV21, jH12, iG4, zD5, zD2, boolValueOf, jH13, arrayList3, strV12, strV13, strV22, zD3, jH14, iG7, strV14, iG5, jH15, strV23, strV15, jH16, iG6);
            case 18:
                C1248j c1248j = new C1248j();
                c1248j.f20687r = parcel.readInt();
                return c1248j;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                J j = new J(parcel);
                j.f20561r = parcel.readByte() != 0;
                return j;
            case 20:
                b bVar = new b();
                bVar.f21039z = 255;
                bVar.f21016B = -2;
                bVar.f21017C = -2;
                bVar.f21018D = -2;
                bVar.f21025K = Boolean.TRUE;
                bVar.f21031r = parcel.readInt();
                bVar.f21032s = (Integer) parcel.readSerializable();
                bVar.f21033t = (Integer) parcel.readSerializable();
                bVar.f21034u = (Integer) parcel.readSerializable();
                bVar.f21035v = (Integer) parcel.readSerializable();
                bVar.f21036w = (Integer) parcel.readSerializable();
                bVar.f21037x = (Integer) parcel.readSerializable();
                bVar.f21038y = (Integer) parcel.readSerializable();
                bVar.f21039z = parcel.readInt();
                bVar.f21015A = parcel.readString();
                bVar.f21016B = parcel.readInt();
                bVar.f21017C = parcel.readInt();
                bVar.f21018D = parcel.readInt();
                bVar.f21020F = parcel.readString();
                bVar.f21021G = parcel.readString();
                bVar.f21022H = parcel.readInt();
                bVar.f21024J = (Integer) parcel.readSerializable();
                bVar.f21026L = (Integer) parcel.readSerializable();
                bVar.f21027M = (Integer) parcel.readSerializable();
                bVar.f21028N = (Integer) parcel.readSerializable();
                bVar.f21029O = (Integer) parcel.readSerializable();
                bVar.f21030P = (Integer) parcel.readSerializable();
                bVar.Q = (Integer) parcel.readSerializable();
                bVar.T = (Integer) parcel.readSerializable();
                bVar.R = (Integer) parcel.readSerializable();
                bVar.S = (Integer) parcel.readSerializable();
                bVar.f21025K = (Boolean) parcel.readSerializable();
                bVar.f21019E = (Locale) parcel.readSerializable();
                bVar.U = (Boolean) parcel.readSerializable();
                return bVar;
            case 21:
                return new p226x2.b(parcel);
            case 22:
                return new d(parcel);
            case 23:
                return new f(parcel);
            case 24:
                return new p226x2.h(parcel);
            case 25:
                return new n(parcel);
            case 26:
                return new x(parcel);
            case 27:
                return new y(parcel);
            default:
                p231x7.a aVar = new p231x7.a(parcel);
                aVar.f24387r = ((Integer) parcel.readValue(p231x7.a.class.getClassLoader())).intValue();
                return aVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f15883a) {
            case 0:
                return new i[i10];
            case 1:
                return new C0929b[i10];
            case 2:
                return new C0930c[i10];
            case 3:
                return new G[i10];
            case 4:
                return new M[i10];
            case 5:
                return new P[i10];
            case 6:
                return new S[i10];
            case 7:
                return new C0972d[i10];
            case 8:
                return new C0975e[i10];
            case 9:
                return new C0987i[i10];
            case 10:
                return new C1019t[i10];
            case 11:
                return new C1022u[i10];
            case 12:
                return new F1[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new I1[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new J1[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new K1[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new S1[i10];
            case 17:
                return new X1[i10];
            case 18:
                return new C1248j[i10];
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new J[i10];
            case 20:
                return new b[i10];
            case 21:
                return new p226x2.b[i10];
            case 22:
                return new d[i10];
            case 23:
                return new f[i10];
            case 24:
                return new p226x2.h[i10];
            case 25:
                return new n[i10];
            case 26:
                return new x[i10];
            case 27:
                return new y[i10];
            default:
                return new p231x7.a[i10];
        }
    }
}
