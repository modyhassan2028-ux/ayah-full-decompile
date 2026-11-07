package p017b7;

import A.C0039q;
import D.AbstractC0066i;
import D.C0076t;
import D0.C0085c;
import D0.u;
import D0.v;
import H7.M;
import I1.W;
import J0.C0285h;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.a1;
import K9.C0389g;
import Q8.C0477y;
import U0.H;
import U0.I;
import W.V0;
import W4.d;
import X9.a;
import X9.b;
import Y9.Q;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.H0;
import Z.InterfaceC0687i0;
import Z.X;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import com.ayah.R;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.ayah.common.data.source.json.model.Emphasis;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Verse;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.K1;
import io.realm.RealmList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l0.o;
import l0.r;
import p095j3.c;
import p120l9.l;
import p120l9.m;
import p120l9.n;
import p120l9.s;
import p124m3.j;
import p134n3.f;
import p134n3.h;
import p134n3.i;
import p151p.j1;
import p151p.l1;
import p185s8.u0;
import p224x0.C1442f;
import p241y9.e;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f13323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f13324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1442f f13325c;

    public static void A0(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iD0 = D0(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        F0(parcel, iD0);
    }

    public static void B0(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iD0 = D0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        F0(parcel, iD0);
    }

    public static final long C(int i10) {
        long j = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = B0.a.f584n;
        return j;
    }

    public static void C0(Parcel parcel, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0204  */
    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:109:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x021a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275  */
    /* JADX WARN: Code duplicated, block: B:124:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x028d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0296  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x030f  */
    /* JADX WARN: Code duplicated, block: B:139:0x031b  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0182  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196  */
    /* JADX WARN: Code duplicated, block: B:91:0x0199  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(c cVar, e eVar, r rVar, e eVar2, NumberFormat numberFormat, C0698o c0698o, int i10, int i11) {
        int i12;
        r rVar2;
        int i13;
        boolean z10;
        NumberFormat numberFormat2;
        r rVar3;
        C0699o0 c0699o0R;
        r rVar4;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        Object obj;
        p150o9.c cVar2;
        Object obj2;
        e eVar3;
        Object objH;
        Object obj3;
        X x9;
        boolean zI;
        Object obj4;
        int i16;
        int i17;
        p241y9.a aVar;
        C0285h c0285h;
        Iterator it;
        T4.b bVar;
        int i18;
        int i19;
        int i20;
        boolean z13;
        Object obj5;
        p241y9.a aVar2;
        Context context;
        j jVar;
        j jVar2;
        int i21;
        p124m3.a aVar3;
        boolean z14;
        int i22;
        boolean z15;
        p124m3.a aVar4;
        boolean z16;
        int i23;
        int i24;
        boolean z17;
        String string;
        boolean z18;
        boolean z19;
        String lowerCase;
        String strD;
        String strD2;
        int i25;
        String strB;
        String strB2;
        int i26;
        c cVar3 = cVar;
        Object obj6 = eVar2;
        p251z9.j.e(cVar3, "khatmahPlan");
        p251z9.j.e(eVar, "khatmahInfoFetcher");
        c0698o.V(571025346);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.e(cVar3.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.i(eVar) ? 32 : 16;
        }
        int i27 = i11 & 4;
        if (i27 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if (c0698o.i(obj6)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i12 |= i26;
            }
            if ((i10 & 24576) == 0) {
                i12 |= 8192;
            }
            i13 = 1;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i12 & 1, z10)) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i27 != 0) {
                        rVar4 = o.f19333a;
                    } else {
                        rVar4 = rVar2;
                    }
                    NumberFormat numberFormat3 = p125m4.b.f19615b;
                    p251z9.j.d(numberFormat3, "getNumberFormatter(...)");
                    i14 = i12 & (-57345);
                    rVar3 = rVar4;
                    numberFormat2 = numberFormat3;
                } else {
                    c0698o.N();
                    r rVar5 = rVar2;
                    i14 = i12 & (-57345);
                    rVar3 = rVar5;
                    numberFormat2 = numberFormat;
                }
                c0698o.q();
                boolean zI2 = c0698o.i(eVar);
                i15 = i14 & 14;
                if (i15 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zI2 | z11;
                Object objH2 = c0698o.H();
                obj = C0690k.f10683a;
                cVar2 = null;
                obj2 = objH2;
                if (z12 || objH2 == obj) {
                    Object c0039q = new C0039q(eVar, cVar3, (p150o9.c) null);
                    c0698o.e0(c0039q);
                    obj2 = c0039q;
                }
                eVar3 = (e) obj2;
                objH = c0698o.H();
                obj3 = objH;
                if (objH == obj) {
                    Object objR = C0672b.r(p120l9.r.f19440r);
                    c0698o.e0(objR);
                    obj3 = objR;
                }
                x9 = (X) obj3;
                zI = c0698o.i(eVar3);
                Object objH3 = c0698o.H();
                obj4 = objH3;
                if (zI || objH3 == obj) {
                    Object h7 = new H0(eVar3, x9, cVar2, i13);
                    c0698o.e0(h7);
                    obj4 = h7;
                }
                C0672b.f(c0698o, cVar3, (e) obj4);
                r rVarB = rVar3.b(androidx.compose.foundation.layout.c.f11826a);
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                i16 = c0698o.f10721P;
                i17 = 1;
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                r rVarC = l0.a.c(c0698o, rVarB);
                InterfaceC0288k.f4142a.getClass();
                aVar = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(aVar);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0076tA, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i16))) {
                    p123m2.c.y(i16, c0698o, i16, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                c0698o.T(1393872579);
                it = ((Iterable) x9.getValue()).iterator();
                while (it.hasNext()) {
                    bVar = (T4.b) it.next();
                    if (obj6 == null) {
                        c0698o.T(-1074223309);
                        z13 = false;
                        c0698o.p(false);
                        aVar2 = null;
                    } else {
                        c0698o.T(-1074202229);
                        if ((i14 & 7168) == 2048) {
                            i18 = i17;
                        } else {
                            i18 = 0;
                        }
                        if (i15 == 4) {
                            i19 = i17;
                        } else {
                            i19 = 0;
                        }
                        i20 = i18 | i19 | (c0698o.i(bVar) ? 1 : 0);
                        Object objH4 = c0698o.H();
                        if (i20 == 0 || objH4 == obj) {
                            z13 = false;
                            Object dVar = new d(obj6, cVar3, bVar, false ? 1 : 0);
                            c0698o.e0(dVar);
                            obj5 = dVar;
                        } else {
                            z13 = false;
                            obj5 = objH4;
                        }
                        aVar2 = (p241y9.a) obj5;
                        c0698o.p(z13);
                    }
                    String str = numberFormat2.format(Integer.valueOf(bVar.f7783a.f18757a + 1));
                    p251z9.j.d(str, "format(...)");
                    Object[] objArr = new Object[i17];
                    objArr[z13 ? 1 : 0] = str;
                    String strN0 = p000a.a.n0(R.string.khatmah_day, objArr, c0698o);
                    context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                    jVar = bVar.f7785c;
                    p251z9.j.e(context, "context");
                    jVar2 = bVar.f7784b;
                    Iterator it2 = it;
                    i21 = jVar2.f19586b;
                    aVar3 = jVar2.f19596n;
                    if (i21 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i22 = jVar.f19586b;
                    z15 = z14;
                    aVar4 = jVar.f19596n;
                    if (i22 == aVar4.f19537m) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    i23 = (jVar.f19595m - jVar2.f19595m) + 1;
                    if (p125m4.b.b()) {
                        i24 = 5;
                    } else {
                        i24 = 2;
                    }
                    if (i23 > i24 && z15 && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    string = context.getString(R.string.khatmah_range_from);
                    z18 = z17;
                    p251z9.j.d(string, "getString(...)");
                    z19 = z16;
                    String string2 = context.getString(R.string.khatmah_range_to);
                    p251z9.j.d(string2, "getString(...)");
                    r rVar6 = rVar3;
                    lowerCase = string2.toLowerCase(Locale.ROOT);
                    p251z9.j.d(lowerCase, "toLowerCase(...)");
                    if (z18) {
                        strB2 = m.l0(bVar.f7786d, p245z2.a.D(" ", context.getString(R.string.khatmah_and), " "), null, null, new G9.m(7), 30);
                        i25 = 1;
                    } else {
                        strD = jVar2.d(context);
                        strD2 = jVar.d(context);
                        if (!z15 && z19) {
                            strD = aVar3.b();
                            strD2 = aVar4.b();
                            i25 = 1;
                        } else if (z15) {
                            if (bVar.f7786d.size() == 1) {
                                String string3 = context.getString(R.string.khatmah_beginning_of, aVar3.b());
                                p251z9.j.d(string3, "getString(...)");
                                strB = string3;
                            } else {
                                strB = aVar3.b();
                            }
                            i25 = 1;
                            strD = strB;
                        } else {
                            i25 = 1;
                            if (z19) {
                                strD2 = context.getString(R.string.khatmah_end_of, aVar4.b());
                                p251z9.j.d(strD2, "getString(...)");
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(" ");
                        sb.append(strD);
                        sb.append(" ");
                        sb.append(lowerCase);
                        strB2 = p.B(sb, " ", strD2);
                    }
                    NumberFormat numberFormat4 = numberFormat2;
                    int i28 = i25;
                    Y2.a.c(strN0, strB2, aVar2, null, c0698o, 0, 8);
                    obj6 = eVar2;
                    it = it2;
                    numberFormat2 = numberFormat4;
                    i15 = i15;
                    i14 = i14;
                    i17 = i28;
                    rVar3 = rVar6;
                    cVar3 = cVar;
                }
                c0698o.p(false);
                c0698o.p(i17);
            } else {
                c0698o.N();
                numberFormat2 = numberFormat;
                rVar3 = rVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new W4.e(cVar, eVar, rVar3, eVar2, numberFormat2, i10, i11);
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        if ((i10 & 3072) == 0) {
            if (c0698o.i(obj6)) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i12 |= i26;
        }
        if ((i10 & 24576) == 0) {
            i12 |= 8192;
        }
        i13 = 1;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i12 & 1, z10)) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                NumberFormat numberFormat5 = p125m4.b.f19615b;
                p251z9.j.d(numberFormat5, "getNumberFormatter(...)");
                i14 = i12 & (-57345);
                rVar3 = rVar4;
                numberFormat2 = numberFormat5;
            } else {
                if (i27 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                NumberFormat numberFormat6 = p125m4.b.f19615b;
                p251z9.j.d(numberFormat6, "getNumberFormatter(...)");
                i14 = i12 & (-57345);
                rVar3 = rVar4;
                numberFormat2 = numberFormat6;
            }
            c0698o.q();
            boolean zI3 = c0698o.i(eVar);
            i15 = i14 & 14;
            if (i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zI3 | z11;
            Object objH5 = c0698o.H();
            obj = C0690k.f10683a;
            cVar2 = null;
            obj2 = objH5;
            if (z12) {
                Object c0039q2 = new C0039q(eVar, cVar3, (p150o9.c) null);
                c0698o.e0(c0039q2);
                obj2 = c0039q2;
            } else {
                Object c0039q3 = new C0039q(eVar, cVar3, (p150o9.c) null);
                c0698o.e0(c0039q3);
                obj2 = c0039q3;
            }
            eVar3 = (e) obj2;
            objH = c0698o.H();
            obj3 = objH;
            if (objH == obj) {
                Object objR2 = C0672b.r(p120l9.r.f19440r);
                c0698o.e0(objR2);
                obj3 = objR2;
            }
            x9 = (X) obj3;
            zI = c0698o.i(eVar3);
            Object objH6 = c0698o.H();
            obj4 = objH6;
            if (zI) {
                Object h10 = new H0(eVar3, x9, cVar2, i13);
                c0698o.e0(h10);
                obj4 = h10;
            } else {
                Object h11 = new H0(eVar3, x9, cVar2, i13);
                c0698o.e0(h11);
                obj4 = h11;
            }
            C0672b.f(c0698o, cVar3, (e) obj4);
            r rVarB2 = rVar3.b(androidx.compose.foundation.layout.c.f11826a);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            i16 = c0698o.f10721P;
            i17 = 1;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, rVarB2);
            InterfaceC0288k.f4142a.getClass();
            aVar = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA2, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M2, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            } else {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            }
            C0672b.v(c0698o, rVarC2, C0287j.f4117d);
            c0698o.T(1393872579);
            it = ((Iterable) x9.getValue()).iterator();
            while (it.hasNext()) {
                bVar = (T4.b) it.next();
                if (obj6 == null) {
                    c0698o.T(-1074223309);
                    z13 = false;
                    c0698o.p(false);
                    aVar2 = null;
                } else {
                    c0698o.T(-1074202229);
                    if ((i14 & 7168) == 2048) {
                        i18 = i17;
                    } else {
                        i18 = 0;
                    }
                    if (i15 == 4) {
                        i19 = i17;
                    } else {
                        i19 = 0;
                    }
                    i20 = i18 | i19 | (c0698o.i(bVar) ? 1 : 0);
                    Object objH7 = c0698o.H();
                    if (i20 == 0) {
                        z13 = false;
                        Object dVar2 = new d(obj6, cVar3, bVar, false ? 1 : 0);
                        c0698o.e0(dVar2);
                        obj5 = dVar2;
                    } else {
                        z13 = false;
                        Object dVar3 = new d(obj6, cVar3, bVar, false ? 1 : 0);
                        c0698o.e0(dVar3);
                        obj5 = dVar3;
                    }
                    aVar2 = (p241y9.a) obj5;
                    c0698o.p(z13);
                }
                String str2 = numberFormat2.format(Integer.valueOf(bVar.f7783a.f18757a + 1));
                p251z9.j.d(str2, "format(...)");
                Object[] objArr2 = new Object[i17];
                objArr2[z13 ? 1 : 0] = str2;
                String strN1 = p000a.a.n0(R.string.khatmah_day, objArr2, c0698o);
                context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                jVar = bVar.f7785c;
                p251z9.j.e(context, "context");
                jVar2 = bVar.f7784b;
                Iterator it3 = it;
                i21 = jVar2.f19586b;
                aVar3 = jVar2.f19596n;
                if (i21 == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i22 = jVar.f19586b;
                z15 = z14;
                aVar4 = jVar.f19596n;
                if (i22 == aVar4.f19537m) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                i23 = (jVar.f19595m - jVar2.f19595m) + 1;
                if (p125m4.b.b()) {
                    i24 = 5;
                } else {
                    i24 = 2;
                }
                if (i23 > i24) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                string = context.getString(R.string.khatmah_range_from);
                z18 = z17;
                p251z9.j.d(string, "getString(...)");
                z19 = z16;
                String string4 = context.getString(R.string.khatmah_range_to);
                p251z9.j.d(string4, "getString(...)");
                r rVar7 = rVar3;
                lowerCase = string4.toLowerCase(Locale.ROOT);
                p251z9.j.d(lowerCase, "toLowerCase(...)");
                if (z18) {
                    strB2 = m.l0(bVar.f7786d, p245z2.a.D(" ", context.getString(R.string.khatmah_and), " "), null, null, new G9.m(7), 30);
                    i25 = 1;
                } else {
                    strD = jVar2.d(context);
                    strD2 = jVar.d(context);
                    if (!z15) {
                        if (z15) {
                            if (bVar.f7786d.size() == 1) {
                                String string5 = context.getString(R.string.khatmah_beginning_of, aVar3.b());
                                p251z9.j.d(string5, "getString(...)");
                                strB = string5;
                            } else {
                                strB = aVar3.b();
                            }
                            i25 = 1;
                            strD = strB;
                        } else {
                            i25 = 1;
                            if (z19) {
                                strD2 = context.getString(R.string.khatmah_end_of, aVar4.b());
                                p251z9.j.d(strD2, "getString(...)");
                            }
                        }
                    } else if (z15) {
                        if (bVar.f7786d.size() == 1) {
                            String string6 = context.getString(R.string.khatmah_beginning_of, aVar3.b());
                            p251z9.j.d(string6, "getString(...)");
                            strB = string6;
                        } else {
                            strB = aVar3.b();
                        }
                        i25 = 1;
                        strD = strB;
                    } else {
                        i25 = 1;
                        if (z19) {
                            strD2 = context.getString(R.string.khatmah_end_of, aVar4.b());
                            p251z9.j.d(strD2, "getString(...)");
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(" ");
                    sb2.append(strD);
                    sb2.append(" ");
                    sb2.append(lowerCase);
                    strB2 = p.B(sb2, " ", strD2);
                }
                NumberFormat numberFormat7 = numberFormat2;
                int i29 = i25;
                Y2.a.c(strN1, strB2, aVar2, null, c0698o, 0, 8);
                obj6 = eVar2;
                it = it3;
                numberFormat2 = numberFormat7;
                i15 = i15;
                i14 = i14;
                i17 = i29;
                rVar3 = rVar7;
                cVar3 = cVar;
            }
            c0698o.p(false);
            c0698o.p(i17);
        } else {
            c0698o.N();
            numberFormat2 = numberFormat;
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new W4.e(cVar, eVar, rVar3, eVar2, numberFormat2, i10, i11);
        }
    }

    public static int D0(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void E(p047e5.a aVar, r rVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        p251z9.j.e(aVar, "groupedTextStyle");
        c0698o.V(2010823563);
        int i11 = (c0698o.e(aVar.ordinal()) ? 4 : 2) | i10 | 48;
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                c0698o2 = c0698o;
                c0698o2.T(-1759806409);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                c0698o.T(-1758781890);
                c0698o2 = c0698o;
                V0.g(androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f11826a, 12, 0.0f, 2), 0.0f, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).i(), c0698o2, 48, 0);
            } else {
                if (iOrdinal != 3) {
                    throw new A6.a();
                }
                c0698o2 = c0698o;
                c0698o2.T(-1759806409);
            }
            c0698o2.p(false);
            rVar = o.f19333a;
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 9, aVar, rVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader E0() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f13323a == null) {
            Thread thread2 = f13324b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f13324b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e11.getMessage());
                    }
                }
                f13323a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        Da.b bVar = new Da.b(threadGroup, "GmsDynamite");
                                        try {
                                            bVar.setContextClassLoader(null);
                                            bVar.start();
                                            thread = bVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = bVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f13324b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f13324b.getContextClassLoader();
                    }
                }
                f13323a = contextClassLoader;
            }
        }
        return f13323a;
    }

    public static Object F(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void F0(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static final long G(String str) {
        I9.c cVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i10 = I9.a.f3852u;
        char cCharAt2 = str.charAt(0);
        int i11 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = i11 > 0 && H9.o.o1(str, '-');
        if (length <= i11) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i11) != 'P') {
            throw new IllegalArgumentException();
        }
        int i12 = i11 + 1;
        if (i12 == length) {
            throw new IllegalArgumentException();
        }
        I9.c cVar2 = null;
        long jF = 0;
        boolean z11 = false;
        while (i12 < length) {
            if (str.charAt(i12) != 'T') {
                int i13 = i12;
                while (i13 < str.length() && (('0' <= (cCharAt = str.charAt(i13)) && cCharAt < ':') || H9.o.U0("+-.", cCharAt))) {
                    i13++;
                }
                String strSubstring = str.substring(i12, i13);
                p251z9.j.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i12;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i14 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        cVar = I9.c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        cVar = I9.c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = I9.c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = I9.c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iB1 = H9.o.b1(strSubstring, '.', 0, 6);
                if (cVar != I9.c.SECONDS || iB1 <= 0) {
                    jF = I9.a.f(jF, t0(k0(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iB1);
                    p251z9.j.d(strSubstring2, "substring(...)");
                    long jF2 = I9.a.f(jF, t0(k0(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iB1);
                    p251z9.j.d(strSubstring3, "substring(...)");
                    double d5 = Double.parseDouble(strSubstring3);
                    double dQ = B1.q(d5, cVar, I9.c.NANOSECONDS);
                    if (Double.isNaN(dQ)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jW = B9.a.W(dQ);
                    jF = I9.a.f(jF2, (-4611686018426999999L > jW || jW >= 4611686018427000000L) ? Y(B9.a.W(B1.q(d5, cVar, I9.c.MILLISECONDS))) : Z(jW));
                }
                cVar2 = cVar;
                i12 = i14;
            } else {
                if (z11 || (i12 = i12 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        return z10 ? I9.a.h(jF) : jF;
    }

    public static void G0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static final void H(E0.d dVar, v vVar) {
        E0.c cVar = (E0.c) dVar.f1420c;
        E0.c cVar2 = (E0.c) dVar.f1419b;
        boolean zA = u.a(vVar);
        long j = vVar.f1133b;
        if (zA) {
            E0.a[] aVarArr = cVar2.f1414d;
            l.e0(0, aVarArr.length, null, aVarArr);
            cVar2.f1415e = 0;
            E0.a[] aVarArr2 = cVar.f1414d;
            l.e0(0, aVarArr2.length, null, aVarArr2);
            cVar.f1415e = 0;
            dVar.f1418a = 0L;
        }
        if (!u.c(vVar)) {
            List list = vVar.f1140k;
            if (list == null) {
                list = p120l9.r.f19440r;
            }
            int i10 = 0;
            for (int size = list.size(); i10 < size; size = size) {
                C0085c c0085c = (C0085c) list.get(i10);
                long j10 = c0085c.f1087a;
                long j11 = c0085c.f1089c;
                cVar2.a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
                cVar.a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
                i10++;
            }
            long j12 = vVar.f1141l;
            cVar2.a(j, Float.intBitsToFloat((int) (j12 >> 32)));
            cVar.a(j, Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }
        if (u.c(vVar) && j - dVar.f1418a > 40) {
            E0.a[] aVarArr3 = cVar2.f1414d;
            l.e0(0, aVarArr3.length, null, aVarArr3);
            cVar2.f1415e = 0;
            E0.a[] aVarArr4 = cVar.f1414d;
            l.e0(0, aVarArr4.length, null, aVarArr4);
            cVar.f1415e = 0;
            dVar.f1418a = 0L;
        }
        dVar.f1418a = j;
    }

    public static void I(StringBuilder sb, Object obj, p241y9.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.e(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final void J(View view, p241y9.c cVar) {
        p251z9.j.e(view, "<this>");
        p071g9.c cVar2 = new p071g9.c();
        Aa.a aVar = new Aa.a();
        aVar.f555s = new M();
        aVar.f557u = new M();
        aVar.f556t = new ArrayList();
        cVar2.f16343a = aVar;
        cVar.e(cVar2);
        cVar2.f16343a.b(view);
    }

    public static final M3.a K(BookmarkType bookmarkType) {
        p251z9.j.e(bookmarkType, "<this>");
        switch (M3.b.f5686a[bookmarkType.ordinal()]) {
            case 1:
                return M3.a.RED;
            case 2:
                return M3.a.YELLOW;
            case 3:
                return M3.a.GREEN;
            case 4:
                return M3.a.BLUE;
            case 5:
                return M3.a.ORANGE;
            case 6:
                return M3.a.PURPLE;
            default:
                throw new A6.a();
        }
    }

    public static final BookmarkType L(M3.a aVar) {
        p251z9.j.e(aVar, "<this>");
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return BookmarkType.RED;
        }
        if (iOrdinal == 1) {
            return BookmarkType.YELLOW;
        }
        if (iOrdinal == 2) {
            return BookmarkType.GREEN;
        }
        if (iOrdinal == 3) {
            return BookmarkType.BLUE;
        }
        if (iOrdinal == 4) {
            return BookmarkType.ORANGE;
        }
        if (iOrdinal == 5) {
            return BookmarkType.PURPLE;
        }
        throw new A6.a();
    }

    public static final Object M(p118l7.o oVar, C0477y c0477y) throws Exception {
        if (!oVar.f()) {
            C0389g c0389g = new C0389g(1, AbstractC0813f2.H(c0477y));
            c0389g.s();
            oVar.f19422b.f(new p118l7.m(T9.a.f7971r, new p248z6.c(27, c0389g)));
            oVar.n();
            return c0389g.r();
        }
        Exception excD = oVar.d();
        if (excD != null) {
            throw excD;
        }
        if (!oVar.f19424d) {
            return oVar.e();
        }
        throw new CancellationException("Task " + oVar + " was cancelled normally.");
    }

    public static final void N(View view) {
        p251z9.j.e(view, "<this>");
        G9.j jVarI = AbstractC0813f2.I(new W(view, null, 0));
        while (jVarI.hasNext()) {
            ArrayList arrayList = e0((View) jVarI.next()).f6580a;
            for (int iE = AbstractC0813f2.E(arrayList); -1 < iE; iE--) {
                ((a1) arrayList.get(iE)).f5057a.c();
            }
        }
    }

    public static void O(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbX = p123m2.c.x("startIndex: ", i10, ", endIndex: ", i11, ", size: ");
            sbX.append(i12);
            throw new IndexOutOfBoundsException(sbX.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(p.w(i10, i11, "startIndex: ", " > endIndex: "));
        }
    }

    public static final void P(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
    }

    public static void Q(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i11);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void R(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void S(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
    }

    public static void T(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbX = p123m2.c.x("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbX.append(i12);
            throw new IndexOutOfBoundsException(sbX.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(p.w(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void U(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbX = p123m2.c.x("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbX.append(i12);
            throw new IndexOutOfBoundsException(sbX.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(p.w(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final float W(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f3 += fArr[i10] * fArr2[i10];
        }
        return f3;
    }

    public static final long X(long j) {
        long j10 = (j << 1) + 1;
        int i10 = I9.a.f3852u;
        int i11 = I9.b.f3854a;
        return j10;
    }

    public static final long Y(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? X(B0.c.m(j, -4611686018427387903L, 4611686018427387903L)) : Z(j * ((long) 1000000));
    }

    public static final long Z(long j) {
        long j10 = j << 1;
        int i10 = I9.a.f3852u;
        int i11 = I9.b.f3854a;
        return j10;
    }

    public static File a0(p065g3.a aVar, File file, int i10) {
        p065g3.c cVar = (p065g3.c) aVar.f16281k.get(i10 - 1);
        return new File(file, String.format(Locale.US, "%03d_%d.mp3", Arrays.copyOf(new Object[]{Integer.valueOf(cVar.f16286c), Integer.valueOf(cVar.f16287d)}, 2)));
    }

    public static p124m3.a b0(Chapter chapter, p114l3.b bVar, boolean z10) {
        List list;
        p251z9.j.e(bVar, "pageTypeDecider");
        if (z10) {
            list = p120l9.r.f19440r;
        } else {
            RealmList<Verse> verses = chapter.getVerses();
            ArrayList arrayList = new ArrayList(n.a0(verses, 10));
            for (Verse verse : verses) {
                p251z9.j.b(verse);
                arrayList.add(B0.c.y(verse, bVar));
            }
            list = arrayList;
        }
        int identifier = (int) chapter.getIdentifier();
        int number = (int) chapter.getNumber();
        boolean zIsMeccan = chapter.isMeccan();
        String title = chapter.getTitle();
        String arabicTitle = chapter.getArabicTitle();
        String englishTitle = chapter.getEnglishTitle();
        String titleCodePoint = chapter.getTitleCodePoint();
        String searchableText = chapter.getSearchableText();
        String searchableKeywords = chapter.getSearchableKeywords();
        ChapterHeader header1405 = chapter.getHeader1405();
        p251z9.j.b(header1405);
        p124m3.b bVarY = B1.y(header1405);
        ChapterHeader header1441 = chapter.getHeader1441();
        p251z9.j.b(header1441);
        return new p124m3.a(identifier, number, zIsMeccan, title, arabicTitle, englishTitle, titleCodePoint, searchableText, searchableKeywords, bVarY, B1.y(header1441), list, chapter.getVerses().size(), bVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l9.r] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public static i c0(E3.a aVar, String str) {
        ?? arrayList;
        p251z9.j.e(aVar, "bookEntry");
        Integer num = aVar.f1837h;
        int i10 = aVar.f1835e;
        String str2 = aVar.f1833c;
        int i11 = aVar.f1836f;
        String str3 = aVar.f1832b;
        switch (str3.hashCode()) {
            case -1713722389:
                if (str3.equals("basmalah")) {
                    return new p134n3.a(i11, i10);
                }
                break;
            case -925155509:
                if (str3.equals("reference")) {
                    int i12 = Integer.parseInt(str2);
                    p251z9.j.b(num);
                    return new f(i11, i12, num.intValue());
                }
                break;
            case 112097589:
                if (str3.equals("verse")) {
                    p251z9.j.b(num);
                    return new h(i11, num.intValue());
                }
                break;
            case 395040096:
                if (str3.equals("footnote")) {
                    p251z9.j.b(num);
                    return new p134n3.d(str2, i11, num.intValue());
                }
                break;
            case 739015757:
                if (str3.equals("chapter")) {
                    return new p134n3.b(i11, i10);
                }
                break;
            case 795311618:
                if (str3.equals("heading")) {
                    return new p134n3.e(i11, str2);
                }
                break;
        }
        String str4 = aVar.f1833c;
        Integer numValueOf = Integer.valueOf(i10);
        Integer num2 = aVar.f1837h;
        List<Emphasis> list = aVar.f1834d;
        if (list != null) {
            arrayList = new ArrayList(n.a0(list, 10));
            for (Emphasis emphasis : list) {
                arrayList.add(new p134n3.j(emphasis.f13679a, emphasis.f13680b));
            }
        } else {
            arrayList = p120l9.r.f19440r;
        }
        return new p134n3.g(i11, str4, numValueOf, num2, arrayList, str);
    }

    public static String d0(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(iArr2[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final P1.a e0(View view) {
        P1.a aVar = (P1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        P1.a aVar2 = new P1.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final p055f1.j f0(I i10, int i11) {
        H h7 = i10.f8023a;
        U0.p pVar = i10.f8024b;
        if (h7.f8015a.f8060s.length() != 0) {
            int iD = pVar.d(i11);
            if ((i11 != 0 && iD == pVar.d(i11 - 1)) || (i11 != h7.f8015a.f8060s.length() && iD == pVar.d(i11 + 1))) {
                return i10.a(i11);
            }
        }
        return i10.g(i11);
    }

    public static G1.c g0(AppCompatTextView appCompatTextView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new G1.c(B1.a.k(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i10 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z10 = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z10) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(B1.a.b(K1.e(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new G1.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean h0(p065g3.a aVar, String str, List list) {
        p251z9.j.e(aVar, "<this>");
        p251z9.j.e(str, "rootDirectory");
        p251z9.j.e(list, "suras");
        File file = new File(str, "audio");
        File file2 = new File(file, aVar.f16273a);
        if (!file.exists() || !file2.exists()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!a0(aVar, file2, ((Number) it.next()).intValue()).exists()) {
                return false;
            }
        }
        return true;
    }

    public static boolean i0(Context context) {
        ((p035d3.u) ((Z8.a) p000a.a.G(context, Z8.a.class))).getClass();
        int i10 = p029c8.g.f13552t;
        p029c8.o oVar = p029c8.o.f13572A;
        p050e8.b.l(oVar.f13578y <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (oVar.isEmpty()) {
            return true;
        }
        return ((Boolean) oVar.iterator().next()).booleanValue();
    }

    public static void j0(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" can not be null"));
        }
    }

    public static final long k0(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !H9.o.U0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 >= length) {
                    if (length - i11 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '0') {
                    if (i11 == i10) {
                        i11++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i10++;
            }
        }
        return (!H9.v.R0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(H9.o.W0(1, str));
    }

    public static final void l0(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            G0.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            float[] fArr8 = fArr4[i18];
            p251z9.j.e(fArr8, "<this>");
            p251z9.j.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr9 = fArr5[i19];
                float fW = W(fArr7, fArr9);
                for (int i20 = 0; i20 < i10; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr9[i20] * fW);
                }
            }
            float fSqrt = (float) Math.sqrt(W(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f3 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                fArr7[i21] = fArr7[i21] * f3;
            }
            float[] fArr10 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr10[i22] = i22 < i18 ? 0.0f : W(fArr7, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fW2 = W(fArr5[i23], fArr2);
            float[] fArr11 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fW2 -= fArr11[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fW2 / fArr11[i23];
        }
    }

    public static L2.i m0(Q2.a aVar, String str) {
        long j;
        Map mapB;
        p129m9.g gVar;
        p251z9.j.e(aVar, "connection");
        Q2.c cVarA0 = aVar.a0("PRAGMA table_info(`" + str + "`)");
        try {
            long j10 = 0;
            if (cVarA0.R()) {
                int iR = Y2.a.r(cVarA0, "name");
                int iR2 = Y2.a.r(cVarA0, "type");
                int iR3 = Y2.a.r(cVarA0, "notnull");
                int iR4 = Y2.a.r(cVarA0, "pk");
                int iR5 = Y2.a.r(cVarA0, "dflt_value");
                p129m9.e eVar = new p129m9.e();
                while (true) {
                    String strJ = cVarA0.j(iR);
                    j = j10;
                    eVar.put(strJ, new L2.f(strJ, cVarA0.j(iR2), cVarA0.getLong(iR3) != j10, (int) cVarA0.getLong(iR4), cVarA0.isNull(iR5) ? null : cVarA0.j(iR5), 2));
                    if (!cVarA0.R()) {
                        break;
                    }
                    j10 = j;
                }
                mapB = eVar.b();
                p186s9.b.b(cVarA0, null);
            } else {
                mapB = s.f19441r;
                p186s9.b.b(cVarA0, null);
                j = 0;
            }
            Q2.c cVarA1 = aVar.a0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iR6 = Y2.a.r(cVarA1, "id");
                int iR7 = Y2.a.r(cVarA1, "seq");
                int iR8 = Y2.a.r(cVarA1, "table");
                int iR9 = Y2.a.r(cVarA1, "on_delete");
                int iR10 = Y2.a.r(cVarA1, "on_update");
                List listE0 = p000a.a.e0(cVarA1);
                cVarA1.reset();
                p129m9.g gVar2 = new p129m9.g();
                while (cVarA1.R()) {
                    if (cVarA1.getLong(iR7) == j) {
                        int i10 = (int) cVarA1.getLong(iR6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = iR6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listE0) {
                            int i12 = iR7;
                            List list = listE0;
                            if (((L2.e) obj).f5467r == i10) {
                                arrayList3.add(obj);
                            }
                            iR7 = i12;
                            listE0 = list;
                        }
                        int i13 = iR7;
                        List list2 = listE0;
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList3.get(i14);
                            i14++;
                            L2.e eVar2 = (L2.e) obj2;
                            arrayList.add(eVar2.f5469t);
                            arrayList2.add(eVar2.f5470u);
                            arrayList3 = arrayList3;
                        }
                        gVar2.add(new L2.g(cVarA1.j(iR8), cVarA1.j(iR9), cVarA1.j(iR10), arrayList, arrayList2));
                        iR6 = i11;
                        iR7 = i13;
                        listE0 = list2;
                    }
                }
                p129m9.g gVarF = u0.f(gVar2);
                p186s9.b.b(cVarA1, null);
                Q2.c cVarA2 = aVar.a0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iR11 = Y2.a.r(cVarA2, "name");
                    int iR12 = Y2.a.r(cVarA2, "origin");
                    int iR13 = Y2.a.r(cVarA2, "unique");
                    if (iR11 == -1 || iR12 == -1 || iR13 == -1) {
                        p186s9.b.b(cVarA2, null);
                        gVar = null;
                    } else {
                        p129m9.g gVar3 = new p129m9.g();
                        while (cVarA2.R()) {
                            if ("c".equals(cVarA2.j(iR12))) {
                                L2.h hVarF0 = p000a.a.f0(aVar, cVarA2.j(iR11), cVarA2.getLong(iR13) == 1);
                                if (hVarF0 == null) {
                                    p186s9.b.b(cVarA2, null);
                                    gVar = null;
                                } else {
                                    gVar3.add(hVarF0);
                                }
                            }
                        }
                        p129m9.g gVarF2 = u0.f(gVar3);
                        p186s9.b.b(cVarA2, null);
                        gVar = gVarF2;
                    }
                    return new L2.i(str, mapB, gVarF, gVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p186s9.b.b(cVarA2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    p186s9.b.b(cVarA1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                p186s9.b.b(cVarA0, th5);
                throw th6;
            }
        }
    }

    public static void n0(Context context, Bitmap bitmap) throws IOException {
        p251z9.j.e(bitmap, "bitmap");
        File file = new File(context.getCacheDir(), "shares");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "share.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
            Uri uriD = FileProvider.d(context, context.getPackageName() + ".fileprovider", file2);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            intent.addFlags(524288);
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.STREAM", uriD);
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.action_share)));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p181s2.o.e(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static void o0(TextView textView, int i10) {
        B0.c.h(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            B1.a.o(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void p0(TextView textView, int i10) {
        B0.c.h(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void q0(TextView textView, int i10) {
        B0.c.h(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void r0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j1.a(view, charSequence);
            return;
        }
        l1 l1Var = l1.f20722B;
        if (l1Var != null && l1Var.f20725r == view) {
            l1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l1(view, charSequence);
            return;
        }
        l1 l1Var2 = l1.f20723C;
        if (l1Var2 != null && l1Var2.f20725r == view) {
            l1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final long s0(int i10, I9.c cVar) {
        p251z9.j.e(cVar, "unit");
        return cVar.compareTo(I9.c.SECONDS) <= 0 ? Z(B1.s(i10, cVar, I9.c.NANOSECONDS)) : t0(i10, cVar);
    }

    public static final long t0(long j, I9.c cVar) {
        p251z9.j.e(cVar, "unit");
        I9.c cVar2 = I9.c.NANOSECONDS;
        long jS = B1.s(4611686018426999999L, cVar2, cVar);
        return ((-jS) > j || j > jS) ? X(B0.c.m(B1.r(j, cVar, I9.c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : Z(B1.s(j, cVar, cVar2));
    }

    public static ActionMode.Callback u0(ActionMode.Callback callback) {
        return (!(callback instanceof N1.j) || Build.VERSION.SDK_INT < 26) ? callback : ((N1.j) callback).f5994a;
    }

    public static ActionMode.Callback v0(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof N1.j) || callback == null) ? callback : new N1.j(callback, textView);
    }

    public static void w0(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iD0 = D0(parcel, i10);
        parcel.writeBundle(bundle);
        F0(parcel, iD0);
    }

    public static void x0(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iD0 = D0(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        F0(parcel, iD0);
    }

    public static void y0(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iD0 = D0(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        F0(parcel, iD0);
    }

    public static void z0(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iD0 = D0(parcel, i10);
        parcel.writeString(str);
        F0(parcel, iD0);
    }

    @Override // X9.b
    public b A(W9.f fVar) {
        p251z9.j.e(fVar, "descriptor");
        return this;
    }

    @Override // X9.b
    public double B() {
        V();
        throw null;
    }

    public void V() {
        throw new U9.d(w.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // X9.b
    public abstract long a();

    @Override // X9.a
    public String b(W9.f fVar, int i10) {
        p251z9.j.e(fVar, "descriptor");
        return w();
    }

    @Override // X9.b
    public Object c(U9.a aVar) {
        p251z9.j.e(aVar, "deserializer");
        return aVar.c(this);
    }

    @Override // X9.b
    public a d(W9.f fVar) {
        p251z9.j.e(fVar, "descriptor");
        return this;
    }

    @Override // X9.b
    public boolean e() {
        V();
        throw null;
    }

    public Object f(W9.f fVar, int i10, U9.a aVar, Object obj) {
        p251z9.j.e(fVar, "descriptor");
        p251z9.j.e(aVar, "deserializer");
        return c(aVar);
    }

    @Override // X9.b
    public boolean g() {
        return true;
    }

    @Override // X9.b
    public char i() {
        V();
        throw null;
    }

    @Override // X9.a
    public double j(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return B();
    }

    @Override // X9.a
    public long k(W9.f fVar, int i10) {
        p251z9.j.e(fVar, "descriptor");
        return a();
    }

    @Override // X9.a
    public short l(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return v();
    }

    @Override // X9.a
    public char m(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return i();
    }

    @Override // X9.a
    public boolean n(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return e();
    }

    @Override // X9.b
    public abstract int o();

    @Override // X9.a
    public int p(W9.f fVar, int i10) {
        p251z9.j.e(fVar, "descriptor");
        return o();
    }

    @Override // X9.b
    public abstract byte r();

    @Override // X9.a
    public float s(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return y();
    }

    public void t(W9.f fVar) {
        p251z9.j.e(fVar, "descriptor");
    }

    @Override // X9.a
    public byte u(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return r();
    }

    @Override // X9.b
    public abstract short v();

    @Override // X9.b
    public String w() {
        V();
        throw null;
    }

    @Override // X9.a
    public Object x(W9.f fVar, int i10, U9.a aVar, Object obj) {
        p251z9.j.e(fVar, "descriptor");
        p251z9.j.e(aVar, "deserializer");
        if (aVar.d().h() || g()) {
            return c(aVar);
        }
        return null;
    }

    @Override // X9.b
    public float y() {
        V();
        throw null;
    }

    @Override // X9.a
    public b z(Q q10, int i10) {
        p251z9.j.e(q10, "descriptor");
        return A(q10.j(i10));
    }
}
