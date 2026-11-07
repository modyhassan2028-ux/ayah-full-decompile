package F2;

import I1.S;
import J0.AbstractC0283f;
import J0.C0280d0;
import J0.z0;
import K9.AbstractC0405x;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import com.ayah.MainActivity;
import com.ayah.feature.navigator.NavigationWrapper;
import com.ayah.ui.widget.search.SearchResultsView;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.WeakHashMap;
import p207v2.C1381t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t extends p251z9.h implements p241y9.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2319z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f2319z = i13;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd A[LOOP:4: B:93:0x018a->B:103:0x01bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x01c2 A[SYNTHETIC] */
    @Override // p241y9.a
    public final Object invoke() throws Exception {
        ContentCaptureSession contentCaptureSessionE;
        C0280d0 c0280d0;
        char c10;
        int i10 = this.f2319z;
        p162q0.s sVar = p162q0.s.f21231u;
        char c11 = 2;
        int i11 = 14;
        int i12 = 1;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj = this.f24870s;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                P9.d dVar = uVar.f2320a;
                if (dVar == null) {
                    p251z9.j.k("coroutineScope");
                    throw null;
                }
                AbstractC0405x.h(dVar, null);
                uVar.d();
                p pVar = uVar.f2324e;
                if (pVar != null) {
                    pVar.f2298f.close();
                    return yVar;
                }
                p251z9.j.k("connectionManager");
                throw null;
            case 1:
                View view = (View) obj;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    B1.b.g(view);
                }
                if (i13 < 29 || (contentCaptureSessionE = A1.b.e(view)) == null) {
                    return null;
                }
                return new N0.b(contentCaptureSessionE, view);
            case 2:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj;
                Class cls = AndroidComposeView.f11987U0;
                if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
                    androidComposeView.clearFocus();
                } else if (androidComposeView.hasFocus()) {
                    View viewFindFocus = androidComposeView.findFocus();
                    if (viewFindFocus != null) {
                        viewFindFocus.clearFocus();
                    }
                    androidComposeView.clearFocus();
                }
                return yVar;
            case 3:
                Class cls2 = AndroidComposeView.f11987U0;
                return ((AndroidComposeView) obj).D();
            case 4:
                ((p020c.D) obj).e();
                return yVar;
            case 5:
                ((p020c.D) obj).e();
                return yVar;
            case 6:
                MainActivity mainActivity = (MainActivity) obj;
                int i14 = MainActivity.f13622J0;
                mainActivity.getClass();
                SearchResultsView searchResultsView = new SearchResultsView(mainActivity, null, 0, 14);
                p035d3.z zVar = new p035d3.z(mainActivity);
                WeakHashMap weakHashMap = S.f3689a;
                I1.I.m(searchResultsView, zVar);
                ViewGroup viewGroup = mainActivity.f13642g0;
                if (viewGroup == null) {
                    p251z9.j.k("searchResultsArea");
                    throw null;
                }
                viewGroup.addView(searchResultsView, -1, -1);
                ViewGroup viewGroup2 = mainActivity.f13642g0;
                if (viewGroup2 == null) {
                    p251z9.j.k("searchResultsArea");
                    throw null;
                }
                viewGroup2.setVisibility(0);
                searchResultsView.setOnClickListener(new p035d3.y(mainActivity, i12));
                View view2 = mainActivity.f13640e0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return yVar;
                }
                p251z9.j.k("bottomBar");
                throw null;
            case 7:
                MainActivity mainActivity2 = (MainActivity) obj;
                ViewGroup viewGroup3 = mainActivity2.f13642g0;
                if (viewGroup3 == null) {
                    p251z9.j.k("searchResultsArea");
                    throw null;
                }
                viewGroup3.removeAllViews();
                ViewGroup viewGroup4 = mainActivity2.f13642g0;
                if (viewGroup4 == null) {
                    p251z9.j.k("searchResultsArea");
                    throw null;
                }
                viewGroup4.setVisibility(8);
                mainActivity2.invalidateOptionsMenu();
                p211v6.a aVar = mainActivity2.f13639d0;
                if (aVar == null) {
                    p251z9.j.k("systemUiHelper");
                    throw null;
                }
                if (aVar.a()) {
                    View view3 = mainActivity2.f13640e0;
                    if (view3 == null) {
                        p251z9.j.k("bottomBar");
                        throw null;
                    }
                    view3.setVisibility(0);
                }
                return yVar;
            case 8:
                MainActivity mainActivity3 = (MainActivity) obj;
                int i15 = MainActivity.f13622J0;
                mainActivity3.C();
                mainActivity3.w().a(false);
                return yVar;
            case 9:
                ((p136n5.e) obj).g();
                return yVar;
            case 10:
                ((p136n5.e) obj).a();
                return yVar;
            case 11:
                ((p136n5.e) obj).c();
                return yVar;
            case 12:
                ((p136n5.e) obj).c();
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                ((p136n5.e) obj).e();
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                ((p136n5.e) obj).g();
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ((p136n5.e) obj).d();
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                ((p136n5.e) obj).f();
                return yVar;
            case 17:
                ((p136n5.e) obj).d();
                return yVar;
            case 18:
                ((p136n5.e) obj).b();
                return yVar;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                p162q0.g gVar = (p162q0.g) obj;
                u.F f3 = gVar.f21196d;
                u.F f7 = gVar.f21197e;
                p162q0.t tVar = (p162q0.t) gVar.f21195c.get();
                long j = 255;
                char c12 = 7;
                if (tVar == null) {
                    Object[] objArr = f7.f22676b;
                    long[] jArr = f7.f22675a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j10 = jArr[i16];
                            int i17 = length;
                            if ((((~j10) << c12) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i16 - i17)) >>> 31);
                                int i19 = 0;
                                while (i19 < i18) {
                                    if ((j10 & 255) < 128) {
                                        ((p162q0.e) objArr[(i16 << 3) + i19]).D(sVar);
                                    }
                                    j10 >>= 8;
                                    i19++;
                                    c12 = c12;
                                }
                                c10 = c12;
                                if (i18 == 8) {
                                }
                            } else {
                                c10 = c12;
                            }
                            length = i17;
                            if (i16 != length) {
                                i16++;
                                c12 = c10;
                            }
                        }
                    }
                } else if (tVar.f19338E) {
                    if (f3.c(tVar)) {
                        tVar.y0();
                    }
                    p162q0.s sVarX0 = tVar.x0();
                    if (!tVar.f19339r.f19338E) {
                        G0.a.b("visitAncestors called on an unattached node");
                    }
                    l0.q qVar = tVar.f19339r;
                    J0.I iX = AbstractC0283f.x(tVar);
                    int i20 = 0;
                    while (iX != null) {
                        if ((((l0.q) iX.f3914W.f4067f).f19342u & 5120) != 0) {
                            while (qVar != null) {
                                int i21 = qVar.f19341t;
                                char c13 = c11;
                                if ((i21 & 5120) != 0) {
                                    if ((i21 & 1024) != 0) {
                                        i20++;
                                    }
                                    if ((qVar instanceof p162q0.e) && f7.c(qVar)) {
                                        if (i20 <= 1) {
                                            ((p162q0.e) qVar).D(sVarX0);
                                        } else {
                                            ((p162q0.e) qVar).D(p162q0.s.f21229s);
                                        }
                                        f7.l(qVar);
                                    }
                                }
                                qVar = qVar.f19343v;
                                c11 = c13;
                            }
                        }
                        char c14 = c11;
                        iX = iX.u();
                        qVar = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
                        c11 = c14;
                    }
                    Object[] objArr2 = f7.f22676b;
                    long[] jArr2 = f7.f22675a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i22 = 0;
                        while (true) {
                            long j11 = jArr2[i22];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                int i24 = 0;
                                while (i24 < i23) {
                                    if ((j11 & j) < 128) {
                                        ((p162q0.e) objArr2[(i22 << 3) + i24]).D(sVar);
                                    }
                                    j11 >>= 8;
                                    i24++;
                                    j = 255;
                                }
                                if (i23 == 8) {
                                    if (i22 != length2) {
                                        i22++;
                                        j = 255;
                                    }
                                }
                            } else if (i22 != length2) {
                                i22++;
                                j = 255;
                            }
                        }
                    }
                }
                gVar.f21194b.invoke();
                f3.b();
                f7.b();
                gVar.f21198f = false;
                return yVar;
            case 20:
                p162q0.k kVar = (p162q0.k) obj;
                if (kVar.f21209l == null || kVar.f21205f.x0() == sVar) {
                    kVar.f21202c.invoke();
                }
                return yVar;
            case 21:
                int i25 = NavigationWrapper.f13816u;
                Object context = ((NavigationWrapper) obj).getContext();
                U3.a aVar2 = context instanceof U3.a ? (U3.a) context : null;
                if (aVar2 != null) {
                    MainActivity mainActivity4 = (MainActivity) aVar2;
                    p176r6.a aVar3 = mainActivity4.f13635Z;
                    if (aVar3 == null) {
                        p251z9.j.k("mainAdapter");
                        throw null;
                    }
                    if (aVar3.f21574v == 1) {
                        aVar3.f21575w = new i7.B(i11);
                        aVar3.f21574v = 2;
                    } else {
                        aVar3.f21575w = new i7.D(13);
                        aVar3.f21574v = 1;
                    }
                    aVar3.d();
                    int i26 = aVar3.f21574v;
                    p176r6.a aVar4 = mainActivity4.f13635Z;
                    if (aVar4 == null) {
                        p251z9.j.k("mainAdapter");
                        throw null;
                    }
                    aVar4.d();
                    mainActivity4.y(i26);
                }
                return yVar;
            case 22:
                ((C1381t) obj).f23295d.i(Boolean.TRUE);
                return yVar;
            case 23:
                ((C1381t) obj).f23295d.i(Boolean.FALSE);
                return yVar;
            default:
                ((C1381t) obj).f23295d.i(Boolean.FALSE);
                return yVar;
        }
    }
}
