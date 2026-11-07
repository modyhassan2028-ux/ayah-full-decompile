package K0;

import A.C0040q0;
import D0.C0086d;
import J0.AbstractC0283f;
import K9.AbstractC0405x;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.reciterlist.qari.QariAudioActivity;
import com.ayah.feature.tafsir.view.TafsirPage;
import com.ayah.ui.widget.search.SearchResultsView;
import io.realm.RealmFieldTypeConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p232y.C1471z;

/* JADX INFO: renamed from: K0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0362p extends p251z9.h implements p241y9.e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f5143z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0362p(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f5143z = i13;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int iN;
        int iN2;
        boolean zA;
        p232y.A aZ0;
        int i10 = this.f5143z;
        boolean z10 = false;
        int i11 = -1;
        int i12 = 1;
        p150o9.c cVar = null;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj3 = this.f24870s;
        switch (i10) {
            case 0:
                return Boolean.valueOf(AndroidComposeView.g((AndroidComposeView) obj3, (p162q0.d) obj, (p171r0.e) obj2));
            case 1:
                p065g3.a aVar = (p065g3.a) obj;
                int iIntValue = ((Number) obj2).intValue();
                p251z9.j.e(aVar, "p0");
                QariAudioActivity qariAudioActivity = (QariAudioActivity) obj3;
                int i13 = QariAudioActivity.f13858a0;
                File externalFilesDir = qariAudioActivity.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    P5.g gVarS = qariAudioActivity.s();
                    String string = externalFilesDir.toString();
                    p251z9.j.d(string, "toString(...)");
                    if (!gVarS.b(aVar, iIntValue)) {
                        AbstractC0405x.x(gVarS.f6708f, null, new P5.a(string, aVar, iIntValue, gVarS, (p150o9.c) null), 3);
                    }
                }
                return yVar;
            case 2:
                p065g3.a aVar2 = (p065g3.a) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                p251z9.j.e(aVar2, "p0");
                int i14 = QariAudioActivity.f13858a0;
                P5.g gVarS2 = ((QariAudioActivity) obj3).s();
                if (!gVarS2.b(aVar2, iIntValue2)) {
                    p085i0.n nVar = gVarS2.f6707e;
                    String str = String.format(Locale.US, "%03d-%d.mp3", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(((p065g3.c) aVar2.f16281k.get(iIntValue2 - 1)).f16287d)}, 2));
                    String str2 = "https://audio.ayah.app/" + aVar2.f16273a + "/" + str;
                    p251z9.j.e(str2, "url");
                    ((ArrayList) nVar.f16734t).add(str2);
                }
                return yVar;
            case 3:
                p065g3.a aVar3 = (p065g3.a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                p251z9.j.e(aVar3, "p0");
                int i15 = QariAudioActivity.f13858a0;
                return Boolean.valueOf(!((QariAudioActivity) obj3).s().b(aVar3, iIntValue3));
            case 4:
                p065g3.a aVar4 = (p065g3.a) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                p251z9.j.e(aVar4, "p0");
                QariAudioActivity qariAudioActivity2 = (QariAudioActivity) obj3;
                int i16 = QariAudioActivity.f13858a0;
                File externalFilesDir2 = qariAudioActivity2.getExternalFilesDir(null);
                if (externalFilesDir2 != null) {
                    P5.g gVarS3 = qariAudioActivity2.s();
                    String string2 = externalFilesDir2.toString();
                    p251z9.j.d(string2, "toString(...)");
                    if (!gVarS3.b(aVar4, iIntValue4)) {
                        AbstractC0405x.x(gVarS3.f6708f, null, new P5.a(aVar4, string2, iIntValue4, gVarS3, (p150o9.c) null), 3);
                    }
                }
                return yVar;
            case 5:
                ((K4.d) obj3).f5238b.a(((Number) obj).intValue(), ((Number) obj2).intValue(), null);
                return yVar;
            case 6:
                ((K4.d) obj3).f5238b.a(((Number) obj).intValue(), ((Number) obj2).intValue(), null);
                return yVar;
            case 7:
                int iIntValue5 = ((Number) obj).intValue();
                int iIntValue6 = ((Number) obj2).intValue();
                p218w3.c cVar2 = ((K4.d) obj3).f5238b;
                AbstractC0405x.x(cVar2.f23655d, null, new p218w3.b(cVar2, iIntValue6, cVar, i12), 3);
                N9.k0 k0Var = cVar2.f23656e;
                z3.d dVar = new z3.d(iIntValue5, iIntValue6);
                k0Var.getClass();
                k0Var.n(null, dVar);
                return yVar;
            case 8:
                ((K4.d) obj3).f5238b.a(((Number) obj).intValue(), ((Number) obj2).intValue(), null);
                return yVar;
            case 9:
                int i17 = KhatmahWrapper.f13794v;
                return ((KhatmahWrapper) obj3).getKhatmahPresenter().a((p095j3.c) obj, (p150o9.c) obj2);
            case 10:
                int i18 = KhatmahWrapper.f13794v;
                return ((KhatmahWrapper) obj3).getKhatmahPresenter().a((p095j3.c) obj, (p150o9.c) obj2);
            case 11:
                W9.f fVar = (W9.f) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                p251z9.j.e(fVar, "p0");
                p009aa.h hVar = (p009aa.h) obj3;
                hVar.getClass();
                if (!fVar.k(iIntValue7) && fVar.j(iIntValue7).h()) {
                    z10 = true;
                }
                hVar.f11242b = z10;
                return Boolean.valueOf(z10);
            case 12:
                TafsirPage tafsirPage = (TafsirPage) obj3;
                View viewE = tafsirPage.f13893t.E(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                if (viewE != null && (iN = RecyclerView.N(viewE)) != -1) {
                    List list = tafsirPage.f13896w.f1623u.f1666f;
                    p251z9.j.d(list, "getCurrentList(...)");
                    p007a6.i iVar = (p007a6.i) list.get(iN);
                    if (iVar instanceof p007a6.b) {
                        i11 = ((p007a6.b) iVar).f11205c.f19528b;
                    }
                }
                return Integer.valueOf(i11);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                TafsirPage tafsirPage2 = (TafsirPage) obj3;
                View viewE2 = tafsirPage2.f13893t.E(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                if (viewE2 != null && (iN2 = RecyclerView.N(viewE2)) != -1) {
                    List list2 = tafsirPage2.f13896w.f1623u.f1666f;
                    p251z9.j.d(list2, "getCurrentList(...)");
                    p007a6.i iVar2 = (p007a6.i) list2.get(iN2);
                    if (iVar2 instanceof p007a6.h) {
                        i11 = ((p007a6.h) iVar2).f11222c.f19585a;
                    }
                }
                return Integer.valueOf(i11);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p162q0.s sVar = (p162q0.s) obj;
                p162q0.s sVar2 = (p162q0.s) obj2;
                C1471z c1471z = (C1471z) obj3;
                if (c1471z.f19338E && (zA = sVar2.a()) != sVar.a()) {
                    p241y9.c cVar3 = c1471z.f24609I;
                    if (cVar3 != null) {
                        cVar3.e(Boolean.valueOf(zA));
                    }
                    if (zA) {
                        AbstractC0405x.x(c1471z.h0(), null, new C0040q0(c1471z, cVar, 24), 3);
                        p251z9.v vVar = new p251z9.v();
                        AbstractC0283f.t(c1471z, new C0086d(26, vVar, c1471z));
                        G.H h7 = (G.H) vVar.f24886r;
                        if (h7 != null) {
                            h7.a();
                        } else {
                            h7 = null;
                        }
                        c1471z.f24611K = h7;
                        J0.j0 j0Var = c1471z.f24612L;
                        if (j0Var != null && j0Var.E0().f19338E && (aZ0 = c1471z.z0()) != null) {
                            aZ0.v0(c1471z.f24612L);
                        }
                    } else {
                        G.H h10 = c1471z.f24611K;
                        if (h10 != null) {
                            h10.b();
                        }
                        c1471z.f24611K = null;
                        p232y.A aZ1 = c1471z.z0();
                        if (aZ1 != null) {
                            aZ1.v0(null);
                        }
                    }
                    AbstractC0283f.o(c1471z);
                    B.j jVar = c1471z.f24608H;
                    if (jVar != null) {
                        if (zA) {
                            B.d dVar2 = c1471z.f24610J;
                            if (dVar2 != null) {
                                c1471z.y0(jVar, new B.e(dVar2));
                                c1471z.f24610J = null;
                            }
                            B.d dVar3 = new B.d();
                            c1471z.y0(jVar, dVar3);
                            c1471z.f24610J = dVar3;
                        } else {
                            B.d dVar4 = c1471z.f24610J;
                            if (dVar4 != null) {
                                c1471z.y0(jVar, new B.e(dVar4));
                                c1471z.f24610J = null;
                            }
                        }
                    }
                }
                return yVar;
            default:
                int iIntValue8 = ((Number) obj).intValue();
                int iIntValue9 = ((Number) obj2).intValue();
                int i19 = SearchResultsView.f13960B;
                ((SearchResultsView) obj3).getJumpModel().a(iIntValue9, iIntValue8, null);
                return yVar;
        }
    }
}
