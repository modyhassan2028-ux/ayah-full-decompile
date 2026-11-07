package K0;

import I1.C0243b;
import U0.AbstractC0517i;
import U0.AbstractC0522n;
import U0.C0513e;
import U0.C0515g;
import U0.C0521m;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.EnumC0767p;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A extends O8.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0243b f4864u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(C0243b c0243b, int i10) {
        super(19);
        this.f4863t = i10;
        this.f4864u = c0243b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:250:0x057f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0585  */
    /* JADX WARN: Code duplicated, block: B:256:0x0594  */
    /* JADX WARN: Code duplicated, block: B:259:0x059d  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:264:0x05af  */
    /* JADX WARN: Code duplicated, block: B:269:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:270:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:276:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:277:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:283:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:291:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:294:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:296:0x0607  */
    /* JADX WARN: Code duplicated, block: B:299:0x061b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0621  */
    /* JADX WARN: Code duplicated, block: B:305:0x0633  */
    /* JADX WARN: Code duplicated, block: B:307:0x063b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0641  */
    /* JADX WARN: Code duplicated, block: B:313:0x0655  */
    /* JADX WARN: Code duplicated, block: B:316:0x065b  */
    /* JADX WARN: Code duplicated, block: B:319:0x0670  */
    /* JADX WARN: Code duplicated, block: B:322:0x0676  */
    /* JADX WARN: Code duplicated, block: B:325:0x068a  */
    /* JADX WARN: Code duplicated, block: B:332:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:333:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:335:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:342:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:344:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x06de  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:350:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:353:0x070a  */
    /* JADX WARN: Code duplicated, block: B:360:0x0719  */
    /* JADX WARN: Code duplicated, block: B:372:0x0743  */
    /* JADX WARN: Code duplicated, block: B:374:0x074b  */
    /* JADX WARN: Code duplicated, block: B:384:0x076a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0770  */
    /* JADX WARN: Code duplicated, block: B:388:0x077a  */
    /* JADX WARN: Code duplicated, block: B:390:0x0783  */
    /* JADX WARN: Code duplicated, block: B:392:0x0786  */
    /* JADX WARN: Code duplicated, block: B:396:0x0795  */
    /* JADX WARN: Code duplicated, block: B:399:0x079d  */
    /* JADX WARN: Code duplicated, block: B:405:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:412:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:416:0x07de  */
    /* JADX WARN: Code duplicated, block: B:419:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:421:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:422:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:425:0x0801  */
    /* JADX WARN: Code duplicated, block: B:432:0x0843  */
    /* JADX WARN: Code duplicated, block: B:435:0x0848  */
    /* JADX WARN: Code duplicated, block: B:438:0x0865  */
    /* JADX WARN: Code duplicated, block: B:441:0x086a  */
    /* JADX WARN: Code duplicated, block: B:448:0x0883  */
    /* JADX WARN: Code duplicated, block: B:451:0x0889  */
    /* JADX WARN: Code duplicated, block: B:454:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:457:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:458:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:460:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:462:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:464:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:466:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:470:0x0902  */
    /* JADX WARN: Code duplicated, block: B:472:0x0908  */
    /* JADX WARN: Code duplicated, block: B:473:0x090a  */
    /* JADX WARN: Code duplicated, block: B:475:0x0910  */
    /* JADX WARN: Code duplicated, block: B:477:0x0916  */
    /* JADX WARN: Code duplicated, block: B:481:0x092d  */
    /* JADX WARN: Code duplicated, block: B:483:0x0931  */
    /* JADX WARN: Code duplicated, block: B:486:0x0939  */
    /* JADX WARN: Code duplicated, block: B:488:0x0947  */
    /* JADX WARN: Code duplicated, block: B:490:0x094b  */
    /* JADX WARN: Code duplicated, block: B:492:0x0959  */
    /* JADX WARN: Code duplicated, block: B:500:0x0969  */
    /* JADX WARN: Code duplicated, block: B:503:0x0979  */
    /* JADX WARN: Code duplicated, block: B:505:0x098b  */
    /* JADX WARN: Code duplicated, block: B:507:0x099f  */
    /* JADX WARN: Code duplicated, block: B:509:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:513:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:515:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:516:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:518:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:519:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:522:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:526:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:542:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:548:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:551:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:553:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:573:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:575:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:577:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:580:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:581:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:583:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:586:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:589:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:591:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:597:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b29  */
    /* JADX WARN: Code duplicated, block: B:602:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:605:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:608:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:611:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:613:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:615:0x0bab  */
    /* JADX WARN: Code duplicated, block: B:617:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:619:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:620:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:624:0x0bf8  */
    /* JADX WARN: Code duplicated, block: B:627:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:635:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:638:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:640:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:644:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:646:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:647:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:649:0x0c7b  */
    /* JADX WARN: Code duplicated, block: B:664:0x0cab  */
    /* JADX WARN: Code duplicated, block: B:697:0x09b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x09b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x08f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v75, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r3v119, types: [l9.r] */
    /* JADX WARN: Type inference failed for: r3v120, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v123, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
    private final J1.g G(int i10) {
        int i11;
        E e10;
        J1.g gVar;
        ?? r10;
        E e11;
        AccessibilityNodeInfo accessibilityNodeInfo;
        Resources resources;
        R0.j jVar;
        u.E e12;
        R0.g gVar2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        R0.g gVar3;
        int i12;
        int i13;
        Object objG;
        Object objG2;
        R0.a aVar;
        char c10;
        Object objG3;
        R0.a aVar2;
        Object objG4;
        R0.a aVar3;
        String strT;
        boolean z10;
        R0.j jVar2;
        int i14;
        Object objG5;
        R0.f fVar;
        Object objG6;
        R0.b bVar;
        ArrayList arrayList;
        Object objG7;
        boolean zC;
        int size;
        int size2;
        List listH;
        int size3;
        int i15;
        R0.p pVar;
        Object objG8;
        R0.p pVarJ;
        Object objG9;
        R0.h hVar;
        Object objG10;
        Object objG11;
        R0.h hVar2;
        int iD;
        Bundle bundle;
        AndroidComposeView androidComposeView;
        int iD2;
        AndroidViewHolder androidViewHolderR;
        AndroidViewHolder androidViewHolderR2;
        R0.a aVar4;
        R0.a aVar5;
        R0.a aVar6;
        R0.j jVarK;
        R0.v vVar;
        List list;
        int size4;
        u.s sVar;
        u.z zVar;
        int[] iArr;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        u.z zVar2;
        ArrayList arrayList2;
        int i19;
        Object objG12;
        boolean z11;
        Object objG13;
        Object objG14;
        boolean z12;
        J1.d dVar;
        J1.d dVar2;
        Object objG15;
        Object objG16;
        Object objG17;
        R0.b bVar2;
        ArrayList arrayList3;
        List listH2;
        int size5;
        int i20;
        int i21;
        boolean zC2;
        int i22;
        int i23;
        Object objG18;
        R0.p pVar2;
        Object objG19;
        R0.a aVar7;
        float f3;
        E9.a aVar8;
        R0.v vVar2;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        ArrayList arrayList4;
        CharSequence charSequenceG;
        boolean z13;
        Object objG20;
        R0.a aVar9;
        String str;
        Object objG21;
        List list2;
        boolean z14;
        J0.I iU;
        R0.j jVarW;
        boolean zA;
        Object objG22;
        R0.j jVarW2;
        boolean z15;
        Object objG23;
        R0.a aVar10;
        Object objG24;
        R0.a aVar11;
        Object objG25;
        R0.a aVar12;
        Object objG26;
        R0.a aVar13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG27;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zBooleanValue;
        ?? arrayList5;
        int i24;
        androidx.lifecycle.w wVarH;
        E e13 = (E) this.f4864u;
        AndroidComposeView androidComposeView2 = e13.f4902d;
        C0356m viewTreeOwners = androidComposeView2.getViewTreeOwners();
        if (((viewTreeOwners == null || (wVarH = viewTreeOwners.f5097a.h()) == null) ? null : wVarH.f12672c) == EnumC0767p.f12661r) {
            i11 = i10;
            e10 = e13;
            gVar = null;
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            J1.g gVar4 = new J1.g(accessibilityNodeInfoObtain);
            W0 w9 = (W0) e13.s().b(i10);
            if (w9 == null) {
                i11 = i10;
                e10 = e13;
                gVar = null;
            } else {
                R0.p pVar3 = w9.f5032a;
                if (i10 == -1) {
                    ?? parentForAccessibility = androidComposeView2.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    gVar4.f4220b = -1;
                    accessibilityNodeInfoObtain.setParent(view);
                } else {
                    R0.p pVarJ2 = pVar3.j();
                    Integer numValueOf = pVarJ2 != null ? Integer.valueOf(pVarJ2.g) : null;
                    if (numValueOf == null) {
                        G0.a.c("semanticsNode " + i10 + " has null parent");
                        throw new A6.a();
                    }
                    int iIntValue = numValueOf.intValue();
                    if (iIntValue == androidComposeView2.getSemanticsOwner().a().g) {
                        iIntValue = -1;
                    }
                    gVar4.f4220b = iIntValue;
                    accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                }
                gVar4.f4221c = i10;
                accessibilityNodeInfoObtain.setSource(androidComposeView2, i10);
                gVar4.l(e13.k(w9));
                u.P p10 = e13.f4918v;
                Resources resources2 = androidComposeView2.getContext().getResources();
                gVar4.m("android.view.View");
                R0.j jVar3 = pVar3.f7119d;
                R0.j jVar4 = pVar3.f7119d;
                u.E e14 = jVar3.f7108r;
                if (e14.c(R0.s.f7146D)) {
                    gVar4.m("android.widget.EditText");
                }
                if (e14.c(R0.s.f7179z)) {
                    gVar4.m("android.widget.TextView");
                }
                Object objG28 = e14.g(R0.s.f7176w);
                if (objG28 == null) {
                    objG28 = null;
                }
                R0.g gVar5 = (R0.g) objG28;
                if (gVar5 != null) {
                    int i25 = gVar5.f7079a;
                    if (pVar3.f7120e || R0.p.h(4, pVar3).isEmpty()) {
                        if (i25 == 4) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                        } else if (i25 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                        } else {
                            String strT2 = P.t(i25);
                            if (i25 != 5 || pVar3.m() || jVar3.f7110t) {
                                gVar4.m(strT2);
                            }
                        }
                    }
                }
                accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                gVar4.s(P.l(pVar3));
                List listH3 = R0.p.h(4, pVar3);
                int size6 = listH3.size();
                int i26 = 0;
                while (true) {
                    r10 = gVar4.f4219a;
                    if (i26 >= size6) {
                        break;
                    }
                    int i27 = size6;
                    R0.p pVar4 = (R0.p) listH3.get(i26);
                    List list3 = listH3;
                    int i28 = i26;
                    if (e13.s().a(pVar4.g)) {
                        AndroidViewHolder androidViewHolder = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pVar4.f7118c);
                        int i29 = pVar4.g;
                        if (i29 != -1) {
                            if (androidViewHolder != null) {
                                r10.addChild(androidViewHolder);
                            } else {
                                r10.addChild(androidComposeView2, i29);
                            }
                        }
                    }
                    i26 = i28 + 1;
                    listH3 = list3;
                    size6 = i27;
                }
                if (i10 == e13.f4910n) {
                    gVar4.i(true);
                    gVar4.b(J1.d.f4199i);
                } else {
                    gVar4.i(false);
                    gVar4.b(J1.d.f4198h);
                }
                C0515g c0515gE = I.e(pVar3);
                if (c0515gE != null) {
                    androidComposeView2.getFontFamilyResolver();
                    p063g1.c density = androidComposeView2.getDensity();
                    android.support.v4.media.session.r rVar = e13.f4895I;
                    String str2 = c0515gE.f8060s;
                    List list4 = c0515gE.f8059r;
                    SpannableString spannableString2 = new SpannableString(str2);
                    ArrayList arrayList6 = c0515gE.f8061t;
                    if (arrayList6 != null) {
                        int size7 = arrayList6.size();
                        int i30 = 0;
                        while (i30 < size7) {
                            int i31 = i30;
                            C0513e c0513e = (C0513e) arrayList6.get(i30);
                            ArrayList arrayList7 = arrayList6;
                            U0.C c11 = (U0.C) c0513e.f8054a;
                            int i32 = size7;
                            int i33 = c0513e.f8055b;
                            int i34 = c0513e.f8056c;
                            E e15 = e13;
                            Resources resources3 = resources2;
                            R0.j jVar5 = jVar3;
                            long jB = c11.f7994a.b();
                            u.E e16 = e14;
                            R0.g gVar6 = gVar5;
                            long j = c11.f7995b;
                            Y0.l lVar = c11.f7996c;
                            Y0.j jVar6 = c11.f7997d;
                            p055f1.q qVar = c11.j;
                            p012b1.c cVar = c11.f8002k;
                            AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                            C0515g c0515g = c0515gE;
                            long j10 = c11.f8003l;
                            p055f1.l lVar2 = c11.f8004m;
                            p055f1.p cVar2 = c11.f7994a;
                            J1.g gVar7 = gVar4;
                            if (!p180s0.q.c(jB, cVar2.b())) {
                                cVar2 = jB != 16 ? new p055f1.c(jB) : p055f1.n.f15918a;
                            }
                            va.g.M(spannableString2, cVar2.b(), i33, i34);
                            SpannableString spannableString3 = spannableString2;
                            va.g.N(spannableString3, j, density, i33, i34);
                            if (lVar == null && jVar6 == null) {
                                i24 = 33;
                            } else {
                                StyleSpan styleSpan = new StyleSpan(B1.z(lVar == null ? Y0.l.f10359t : lVar, jVar6 != null ? jVar6.f10356a : 0));
                                i24 = 33;
                                spannableString3.setSpan(styleSpan, i33, i34, 33);
                            }
                            if (lVar2 != null) {
                                int i35 = lVar2.f15916a;
                                if ((i35 | 1) == i35) {
                                    spannableString3.setSpan(new UnderlineSpan(), i33, i34, i24);
                                }
                                if ((i35 | 2) == i35) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i24);
                                }
                            }
                            if (qVar != null) {
                                spannableString3.setSpan(new ScaleXSpan(qVar.f15922a), i33, i34, i24);
                            }
                            va.g.O(spannableString3, cVar, i33, i34);
                            if (j10 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(p180s0.F.u(j10)), i33, i34, i24);
                            }
                            spannableString2 = spannableString3;
                            i30 = i31 + 1;
                            arrayList6 = arrayList7;
                            size7 = i32;
                            e13 = e15;
                            resources2 = resources3;
                            jVar3 = jVar5;
                            gVar5 = gVar6;
                            e14 = e16;
                            accessibilityNodeInfoObtain = accessibilityNodeInfo3;
                            c0515gE = c0515g;
                            gVar4 = gVar7;
                        }
                    }
                    e11 = e13;
                    accessibilityNodeInfo = accessibilityNodeInfoObtain;
                    C0515g c0515g2 = c0515gE;
                    J1.g gVar8 = gVar4;
                    SpannableString spannableString4 = spannableString2;
                    resources = resources2;
                    jVar = jVar3;
                    e12 = e14;
                    gVar2 = gVar5;
                    int length = str2.length();
                    ?? arrayList8 = p120l9.r.f19440r;
                    if (list4 != null) {
                        arrayList5 = new ArrayList(list4.size());
                        int size8 = list4.size();
                        for (int i36 = 0; i36 < size8; i36++) {
                            Object obj = list4.get(i36);
                            C0513e c0513e2 = (C0513e) obj;
                            if ((c0513e2.f8054a instanceof U0.N) && AbstractC0517i.b(0, length, c0513e2.f8055b, c0513e2.f8056c)) {
                                arrayList5.add(obj);
                            }
                        }
                    } else {
                        arrayList5 = arrayList8;
                    }
                    int size9 = arrayList5.size();
                    for (int i37 = 0; i37 < size9; i37++) {
                        C0513e c0513e3 = (C0513e) arrayList5.get(i37);
                        U0.N n6 = (U0.N) c0513e3.f8054a;
                        int i38 = c0513e3.f8055b;
                        int i39 = c0513e3.f8056c;
                        if (!(n6 instanceof U0.N)) {
                            throw new A6.a();
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(n6.f8041a).build(), i38, i39, 33);
                    }
                    int length2 = str2.length();
                    if (list4 != null) {
                        arrayList8 = new ArrayList(list4.size());
                        int size10 = list4.size();
                        for (int i40 = 0; i40 < size10; i40++) {
                            Object obj2 = list4.get(i40);
                            C0513e c0513e4 = (C0513e) obj2;
                            if ((c0513e4.f8054a instanceof U0.M) && AbstractC0517i.b(0, length2, c0513e4.f8055b, c0513e4.f8056c)) {
                                arrayList8.add(obj2);
                            }
                        }
                    }
                    int size11 = arrayList8.size();
                    for (int i41 = 0; i41 < size11; i41++) {
                        C0513e c0513e5 = (C0513e) arrayList8.get(i41);
                        U0.M m10 = (U0.M) c0513e5.f8054a;
                        int i42 = c0513e5.f8055b;
                        int i43 = c0513e5.f8056c;
                        WeakHashMap weakHashMap = (WeakHashMap) rVar.f11364s;
                        Object uRLSpan = weakHashMap.get(m10);
                        if (uRLSpan == null) {
                            uRLSpan = new URLSpan(m10.f8040a);
                            weakHashMap.put(m10, uRLSpan);
                        }
                        spannableString4.setSpan((URLSpan) uRLSpan, i42, i43, 33);
                    }
                    List listA = c0515g2.a(str2.length());
                    int size12 = listA.size();
                    for (int i44 = 0; i44 < size12; i44++) {
                        C0513e c0513e6 = (C0513e) listA.get(i44);
                        int i45 = c0513e6.f8055b;
                        Object obj3 = c0513e6.f8054a;
                        int i46 = c0513e6.f8056c;
                        if (i45 != i46) {
                            AbstractC0522n abstractC0522n = (AbstractC0522n) obj3;
                            if (abstractC0522n instanceof C0521m) {
                                p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                C0521m c0521m = (C0521m) obj3;
                                C0513e c0513e7 = new C0513e(i45, i46, c0521m);
                                WeakHashMap weakHashMap2 = (WeakHashMap) rVar.f11365t;
                                Object uRLSpan2 = weakHashMap2.get(c0513e7);
                                if (uRLSpan2 == null) {
                                    uRLSpan2 = new URLSpan(c0521m.f8099a);
                                    weakHashMap2.put(c0513e7, uRLSpan2);
                                }
                                spannableString4.setSpan((URLSpan) uRLSpan2, i45, i46, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) rVar.f11366u;
                                Object eVar = weakHashMap3.get(c0513e6);
                                if (eVar == null) {
                                    eVar = new p022c1.e(abstractC0522n);
                                    weakHashMap3.put(c0513e6, eVar);
                                }
                                spannableString4.setSpan((ClickableSpan) eVar, i45, i46, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) E.K(spannableString4);
                    gVar = gVar8;
                } else {
                    e11 = e13;
                    accessibilityNodeInfo = accessibilityNodeInfoObtain;
                    resources = resources2;
                    jVar = jVar3;
                    e12 = e14;
                    gVar2 = gVar5;
                    gVar = gVar4;
                    spannableString = null;
                }
                gVar.x(spannableString);
                R0.v vVar3 = R0.s.f7152J;
                u.E e17 = e12;
                if (e17.c(vVar3)) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.setContentInvalid(true);
                    Object objG29 = e17.g(vVar3);
                    if (objG29 == null) {
                        objG29 = null;
                    }
                    r10.setError((CharSequence) objG29);
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                }
                Resources resources4 = resources;
                String strD = I.d(pVar3, resources4);
                if (Build.VERSION.SDK_INT >= 30) {
                    B1.b.i(r10, strD);
                } else {
                    r10.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strD);
                }
                r10.setCheckable(I.c(pVar3));
                Object objG30 = e17.g(R0.s.f7150H);
                if (objG30 == null) {
                    objG30 = null;
                }
                T0.a aVar14 = (T0.a) objG30;
                if (aVar14 != null) {
                    if (aVar14 == T0.a.f7551r) {
                        r10.setChecked(true);
                    } else if (aVar14 == T0.a.f7552s) {
                        r10.setChecked(false);
                    }
                }
                Object objG31 = e17.g(R0.s.f7149G);
                if (objG31 == null) {
                    objG31 = null;
                }
                Boolean bool = (Boolean) objG31;
                if (bool != null) {
                    boolean zBooleanValue2 = bool.booleanValue();
                    if (gVar2 == null) {
                        gVar3 = gVar2;
                        i12 = 4;
                    } else {
                        gVar3 = gVar2;
                        i12 = 4;
                        if (gVar3.f7079a == 4) {
                            r10.setSelected(zBooleanValue2);
                        }
                    }
                    r10.setChecked(zBooleanValue2);
                } else {
                    gVar3 = gVar2;
                    i12 = 4;
                }
                R0.j jVar7 = jVar;
                if (!jVar7.f7110t || R0.p.h(i12, pVar3).isEmpty()) {
                    Object objG32 = e17.g(R0.s.f7156a);
                    if (objG32 == null) {
                        objG32 = null;
                    }
                    List list5 = (List) objG32;
                    gVar.p(list5 != null ? (String) p120l9.m.g0(list5) : null);
                }
                Object objG33 = e17.g(R0.s.f7177x);
                if (objG33 == null) {
                    objG33 = null;
                }
                String str3 = (String) objG33;
                if (str3 != null) {
                    R0.p pVarJ3 = pVar3;
                    while (true) {
                        if (pVarJ3 == null) {
                            zBooleanValue = false;
                            break;
                        }
                        R0.j jVar8 = pVarJ3.f7119d;
                        R0.v vVar4 = R0.t.f7180a;
                        if (jVar8.f7108r.c(vVar4)) {
                            zBooleanValue = ((Boolean) jVar8.c(vVar4)).booleanValue();
                            break;
                        }
                        pVarJ3 = pVarJ3.j();
                    }
                    if (zBooleanValue) {
                        accessibilityNodeInfo2.setViewIdResourceName(str3);
                    }
                }
                R0.v vVar5 = R0.s.f7156a;
                Object objG34 = e17.g(R0.s.f7162h);
                if (objG34 == null) {
                    objG34 = null;
                }
                if (((p110k9.y) objG34) != null) {
                    gVar.q(true);
                }
                accessibilityNodeInfo2.setPassword(e17.c(R0.s.f7151I));
                accessibilityNodeInfo2.setEditable(e17.c(R0.s.f7154L));
                Object objG35 = e17.g(R0.s.f7155M);
                if (objG35 == null) {
                    objG35 = null;
                }
                Integer num = (Integer) objG35;
                r10.setMaxTextLength(num != null ? num.intValue() : -1);
                r10.setEnabled(I.a(pVar3));
                R0.v vVar6 = R0.s.f7164k;
                r10.setFocusable(e17.c(vVar6));
                if (accessibilityNodeInfo2.isFocusable()) {
                    r10.setFocused(((Boolean) jVar7.c(vVar6)).booleanValue());
                    if (accessibilityNodeInfo2.isFocused()) {
                        gVar.a(2);
                        i11 = i10;
                        e10 = e11;
                        e10.f4911o = i11;
                    } else {
                        i11 = i10;
                        e10 = e11;
                        i13 = 1;
                        gVar.a(1);
                    }
                    r10.setVisibleToUser((P.k(pVar3) ? 1 : 0) ^ i13);
                    objG = e17.g(R0.s.j);
                    if (objG == null) {
                        objG = null;
                    }
                    if (((R0.e) objG) != null) {
                        accessibilityNodeInfo2.setLiveRegion(i13);
                    }
                    r10.setClickable(false);
                    objG2 = e17.g(R0.i.f7085b);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    aVar = (R0.a) objG2;
                    c10 = 3;
                    if (aVar != null) {
                        objG27 = e17.g(R0.s.f7149G);
                        if (objG27 == null) {
                            objG27 = null;
                        }
                        boolean zA2 = p251z9.j.a(objG27, Boolean.TRUE);
                        if (gVar3 == null && gVar3.f7079a == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            z17 = true;
                        } else {
                            if (gVar3 == null && gVar3.f7079a == 3) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        if (z17 || (z17 && !zA2)) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        r10.setClickable(z18);
                        if (I.a(pVar3) && accessibilityNodeInfo2.isClickable()) {
                            gVar.b(new J1.d(16, aVar.f7068a));
                        }
                    }
                    r10.setLongClickable(false);
                    objG3 = e17.g(R0.i.f7086c);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    aVar2 = (R0.a) objG3;
                    if (aVar2 != null) {
                        r10.setLongClickable(true);
                        if (I.a(pVar3)) {
                            gVar.b(new J1.d(32, aVar2.f7068a));
                        }
                    }
                    objG4 = e17.g(R0.i.f7097p);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    aVar3 = (R0.a) objG4;
                    if (aVar3 != null) {
                        gVar.b(new J1.d(16384, aVar3.f7068a));
                    }
                    if (I.a(pVar3)) {
                        objG23 = e17.g(R0.i.j);
                        if (objG23 == null) {
                            objG23 = null;
                        }
                        aVar10 = (R0.a) objG23;
                        if (aVar10 != null) {
                            gVar.b(new J1.d(2097152, aVar10.f7068a));
                        }
                        objG24 = e17.g(R0.i.f7096o);
                        if (objG24 == null) {
                            objG24 = null;
                        }
                        aVar11 = (R0.a) objG24;
                        if (aVar11 != null) {
                            gVar.b(new J1.d(android.R.id.accessibilityActionImeEnter, aVar11.f7068a));
                        }
                        objG25 = e17.g(R0.i.f7098q);
                        if (objG25 == null) {
                            objG25 = null;
                        }
                        aVar12 = (R0.a) objG25;
                        if (aVar12 != null) {
                            gVar.b(new J1.d(65536, aVar12.f7068a));
                        }
                        objG26 = e17.g(R0.i.f7099r);
                        if (objG26 == null) {
                            objG26 = null;
                        }
                        aVar13 = (R0.a) objG26;
                        if (aVar13 != null && accessibilityNodeInfo2.isFocused()) {
                            primaryClipDescription = androidComposeView2.getClipboardManager().f5075a.getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                gVar.b(new J1.d(32768, aVar13.f7068a));
                            }
                        }
                    }
                    strT = E.t(pVar3);
                    if (strT != null || strT.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        jVar2 = jVar4;
                    } else {
                        accessibilityNodeInfo2.setTextSelection(e10.r(pVar3), e10.q(pVar3));
                        objG20 = e17.g(R0.i.f7091i);
                        if (objG20 == null) {
                            objG20 = null;
                        }
                        aVar9 = (R0.a) objG20;
                        if (aVar9 != null) {
                            str = aVar9.f7068a;
                        } else {
                            str = null;
                        }
                        gVar.b(new J1.d(131072, str));
                        gVar.a(256);
                        gVar.a(512);
                        r10.setMovementGranularities(11);
                        objG21 = e17.g(R0.s.f7156a);
                        if (objG21 == null) {
                            objG21 = null;
                        }
                        list2 = (List) objG21;
                        if (list2 != null || list2.isEmpty()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14 || !e17.c(R0.i.f7084a)) {
                            jVar2 = jVar4;
                        } else {
                            if (jVar2.f7108r.c(R0.s.f7146D)) {
                                Object objG36 = jVar2.f7108r.g(vVar6);
                                if (objG36 == null) {
                                    jVar2 = jVar4;
                                    objG36 = null;
                                }
                                jVar2 = jVar4;
                                if (p251z9.j.a(objG36, Boolean.TRUE)) {
                                    jVar2 = jVar4;
                                    iU = pVar3.f7118c.u();
                                    while (true) {
                                        if (iU == null) {
                                            iU = null;
                                            break;
                                        }
                                        jVarW2 = iU.w();
                                        if (jVarW2 == null) {
                                        }
                                        iU = iU.u();
                                    }
                                    if (iU != null) {
                                        jVarW = iU.w();
                                        if (jVarW != null) {
                                            objG22 = jVarW.f7108r.g(R0.s.f7164k);
                                            if (objG22 == null) {
                                                objG22 = null;
                                            }
                                            zA = p251z9.j.a(objG22, Boolean.TRUE);
                                        } else {
                                            zA = false;
                                        }
                                        if (zA) {
                                        }
                                    }
                                }
                            } else {
                                jVar2 = jVar4;
                                iU = pVar3.f7118c.u();
                                while (true) {
                                    if (iU == null) {
                                        iU = null;
                                        break;
                                    }
                                    jVarW2 = iU.w();
                                    if (jVarW2 == null && jVarW2.f7110t) {
                                        if (jVarW2.f7108r.c(R0.s.f7146D)) {
                                            break;
                                        }
                                    }
                                    iU = iU.u();
                                }
                                if (iU != null) {
                                    jVarW = iU.w();
                                    if (jVarW != null) {
                                        objG22 = jVarW.f7108r.g(R0.s.f7164k);
                                        if (objG22 == null) {
                                            objG22 = null;
                                        }
                                        zA = p251z9.j.a(objG22, Boolean.TRUE);
                                    } else {
                                        zA = false;
                                    }
                                    z15 = zA ? false : true;
                                }
                            }
                            if (!z15) {
                                r10.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                            }
                        }
                    }
                    i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 26) {
                        arrayList4 = new ArrayList();
                        arrayList4.add("androidx.compose.ui.semantics.id");
                        charSequenceG = gVar.g();
                        if (charSequenceG != null || charSequenceG.length() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13 && e17.c(R0.i.f7084a)) {
                            arrayList4.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (e17.c(R0.s.f7177x)) {
                            arrayList4.add("androidx.compose.ui.semantics.testTag");
                        }
                        gVar.j(arrayList4);
                    }
                    objG5 = e17.g(R0.s.f7158c);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    fVar = (R0.f) objG5;
                    if (fVar != null) {
                        f3 = fVar.f7076a;
                        aVar8 = fVar.f7077b;
                        vVar2 = R0.i.f7090h;
                        if (jVar2.f7108r.c(vVar2)) {
                            gVar.m("android.widget.SeekBar");
                        } else {
                            gVar.m("android.widget.ProgressBar");
                        }
                        if (fVar != R0.f.f7075d) {
                            r10.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(aVar8.f1993a).floatValue(), Float.valueOf(aVar8.f1994b).floatValue(), f3));
                        }
                        if (jVar2.f7108r.c(vVar2) && I.a(pVar3)) {
                            fFloatValue = Float.valueOf(aVar8.f1994b).floatValue();
                            fFloatValue2 = Float.valueOf(aVar8.f1993a).floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f3 < fFloatValue) {
                                gVar.b(J1.d.j);
                            }
                            fFloatValue3 = Float.valueOf(aVar8.f1993a).floatValue();
                            fFloatValue4 = Float.valueOf(aVar8.f1994b).floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f3 > fFloatValue3) {
                                gVar.b(J1.d.f4200k);
                            }
                        }
                    }
                    if (i14 >= 24 && I.a(pVar3)) {
                        objG19 = jVar2.f7108r.g(R0.i.f7090h);
                        if (objG19 == null) {
                            objG19 = null;
                        }
                        aVar7 = (R0.a) objG19;
                        if (aVar7 != null) {
                            gVar.b(new J1.d(android.R.id.accessibilityActionSetProgress, aVar7.f7068a));
                        }
                    }
                    objG6 = pVar3.i().f7108r.g(R0.s.f7161f);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    bVar = (R0.b) objG6;
                    if (bVar != null) {
                        gVar.n(J1.e.a(bVar.f7070a, bVar.f7071b, 0));
                    } else {
                        arrayList = new ArrayList();
                        objG7 = pVar3.i().f7108r.g(R0.s.f7160e);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        if (objG7 != null) {
                            listH = R0.p.h(4, pVar3);
                            size3 = listH.size();
                            i15 = 0;
                            while (i15 < size3) {
                                pVar = (R0.p) listH.get(i15);
                                char c12 = c10;
                                if (pVar.i().f7108r.c(R0.s.f7149G)) {
                                    arrayList.add(pVar);
                                }
                                i15++;
                                c10 = c12;
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zC = B0.c.c(arrayList);
                            if (zC) {
                                size = 1;
                            } else {
                                size = arrayList.size();
                            }
                            if (zC) {
                                size2 = arrayList.size();
                            } else {
                                size2 = 1;
                            }
                            gVar.n(J1.e.a(size, size2, 0));
                        }
                    }
                    objG8 = pVar3.i().f7108r.g(R0.s.g);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    if (objG8 == null) {
                        throw new ClassCastException();
                    }
                    pVarJ = pVar3.j();
                    if (pVarJ != null) {
                        objG16 = pVarJ.i().f7108r.g(R0.s.f7160e);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        if (objG16 != null) {
                            objG17 = pVarJ.i().f7108r.g(R0.s.f7161f);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            bVar2 = (R0.b) objG17;
                            if (bVar2 != null || (bVar2.f7070a >= 0 && bVar2.f7071b >= 0)) {
                                if (pVar3.i().f7108r.c(R0.s.f7149G)) {
                                    arrayList3 = new ArrayList();
                                    listH2 = R0.p.h(4, pVarJ);
                                    size5 = listH2.size();
                                    i21 = 0;
                                    for (i20 = 0; i20 < size5; i20++) {
                                        pVar2 = (R0.p) listH2.get(i20);
                                        if (pVar2.i().f7108r.c(R0.s.f7149G)) {
                                            arrayList3.add(pVar2);
                                            if (pVar2.f7118c.v() < pVar3.f7118c.v()) {
                                                i21++;
                                            }
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        zC2 = B0.c.c(arrayList3);
                                        if (zC2) {
                                            i22 = 0;
                                        } else {
                                            i22 = i21;
                                        }
                                        if (zC2) {
                                            i23 = i21;
                                        } else {
                                            i23 = 0;
                                        }
                                        objG18 = pVar3.i().f7108r.g(R0.s.f7149G);
                                        if (objG18 == null) {
                                            objG18 = Boolean.FALSE;
                                        }
                                        gVar.o(J1.f.a(i22, 1, i23, 1, false, ((Boolean) objG18).booleanValue()));
                                    }
                                }
                            }
                        }
                    }
                    objG9 = jVar2.f7108r.g(R0.s.f7172s);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    hVar = (R0.h) objG9;
                    objG10 = jVar2.f7108r.g(R0.i.f7087d);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    R0.a aVar15 = (R0.a) objG10;
                    if (hVar != null && aVar15 != null) {
                        objG14 = pVar3.i().f7108r.g(R0.s.f7161f);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            objG15 = pVar3.i().f7108r.g(R0.s.f7160e);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            gVar.m("android.widget.HorizontalScrollView");
                        }
                        if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                            gVar.v(true);
                        }
                        if (I.a(pVar3)) {
                            if (E.y(hVar)) {
                                gVar.b(J1.d.j);
                                if (I.f(pVar3)) {
                                    dVar2 = J1.d.f4206q;
                                } else {
                                    dVar2 = J1.d.f4208s;
                                }
                                gVar.b(dVar2);
                            }
                            if (E.x(hVar)) {
                                gVar.b(J1.d.f4200k);
                                if (I.f(pVar3)) {
                                    dVar = J1.d.f4208s;
                                } else {
                                    dVar = J1.d.f4206q;
                                }
                                gVar.b(dVar);
                            }
                        }
                    }
                    objG11 = jVar2.f7108r.g(R0.s.f7173t);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    hVar2 = (R0.h) objG11;
                    if (hVar2 != null && aVar15 != null) {
                        objG12 = pVar3.i().f7108r.g(R0.s.f7161f);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        if (objG12 == null) {
                            objG13 = pVar3.i().f7108r.g(R0.s.f7160e);
                            if (objG13 == null) {
                                objG13 = null;
                            }
                            if (objG13 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            gVar.m("android.widget.ScrollView");
                        }
                        if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                            gVar.v(true);
                        }
                        if (I.a(pVar3)) {
                            if (E.y(hVar2)) {
                                gVar.b(J1.d.j);
                                gVar.b(J1.d.f4207r);
                            }
                            if (E.x(hVar2)) {
                                gVar.b(J1.d.f4200k);
                                gVar.b(J1.d.f4205p);
                            }
                        }
                    }
                    if (i14 >= 29) {
                        P.c(gVar, pVar3);
                    }
                    gVar.t((CharSequence) B9.a.D(pVar3.k(), R0.s.f7159d));
                    if (I.a(pVar3)) {
                        aVar4 = (R0.a) B9.a.D(pVar3.k(), R0.i.f7100s);
                        if (aVar4 != null) {
                            gVar.b(new J1.d(262144, aVar4.f7068a));
                        }
                        aVar5 = (R0.a) B9.a.D(pVar3.k(), R0.i.f7101t);
                        if (aVar5 != null) {
                            gVar.b(new J1.d(524288, aVar5.f7068a));
                        }
                        aVar6 = (R0.a) B9.a.D(pVar3.k(), R0.i.f7102u);
                        if (aVar6 != null) {
                            gVar.b(new J1.d(1048576, aVar6.f7068a));
                        }
                        jVarK = pVar3.k();
                        vVar = R0.i.f7104w;
                        if (jVarK.f7108r.c(vVar)) {
                            list = (List) pVar3.k().c(vVar);
                            size4 = list.size();
                            sVar = E.f4886P;
                            if (size4 < sVar.f22758b) {
                                throw new IllegalStateException(p245z2.a.E(new StringBuilder("Can't have more than "), sVar.f22758b, " custom actions for one widget"));
                            }
                            u.P p11 = new u.P(0);
                            u.z zVarA = u.J.a();
                            if (p10.c(i11)) {
                                zVar = (u.z) p10.d(i11);
                                iArr = sVar.f22757a;
                                i16 = sVar.f22758b;
                                iArr2 = new int[16];
                                i17 = 0;
                                i18 = 0;
                                while (i17 < i16) {
                                    int i47 = iArr[i17];
                                    int i48 = i16;
                                    i19 = i18 + 1;
                                    u.z zVar3 = zVar;
                                    if (iArr2.length < i19) {
                                        int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i19, (iArr2.length * 3) / 2));
                                        p251z9.j.d(iArrCopyOf, "copyOf(...)");
                                        iArr2 = iArrCopyOf;
                                    }
                                    iArr2[i18] = i47;
                                    i17++;
                                    i18 = i19;
                                    i16 = i48;
                                    zVar = zVar3;
                                }
                                zVar2 = zVar;
                                arrayList2 = new ArrayList();
                                if (list.size() <= 0) {
                                    p245z2.a.H(list.get(0));
                                    p251z9.j.b(zVar2);
                                    throw null;
                                }
                                if (arrayList2.size() > 0) {
                                    p245z2.a.H(arrayList2.get(0));
                                    if (i18 > 0) {
                                        int i49 = iArr2[0];
                                        throw null;
                                    }
                                    p204v.a.d("Index must be between 0 and size");
                                    throw null;
                                }
                            } else if (list.size() > 0) {
                                p245z2.a.H(list.get(0));
                                sVar.c(0);
                                throw null;
                            }
                            e10.f4917u.f(i11, p11);
                            p10.f(i11, zVarA);
                        }
                    }
                    gVar.u(I.g(pVar3, resources4));
                    iD = e10.f4891E.d(i11);
                    if (iD != -1) {
                        androidViewHolderR2 = P.r(androidComposeView2.getAndroidViewsHandler$ui_release(), iD);
                        if (androidViewHolderR2 != null) {
                            r10.setTraversalBefore(androidViewHolderR2);
                            androidComposeView = androidComposeView2;
                        } else {
                            androidComposeView = androidComposeView2;
                            r10.setTraversalBefore(androidComposeView, iD);
                        }
                        bundle = null;
                        e10.j(i11, gVar, e10.f4893G, null);
                    } else {
                        bundle = null;
                        androidComposeView = androidComposeView2;
                    }
                    iD2 = e10.f4892F.d(i11);
                    if (iD2 != -1 && (androidViewHolderR = P.r(androidComposeView.getAndroidViewsHandler$ui_release(), iD2)) != null) {
                        r10.setTraversalAfter(androidViewHolderR);
                        e10.j(i11, gVar, e10.f4894H, bundle);
                    }
                } else {
                    i11 = i10;
                    e10 = e11;
                }
                i13 = 1;
                r10.setVisibleToUser((P.k(pVar3) ? 1 : 0) ^ i13);
                objG = e17.g(R0.s.j);
                if (objG == null) {
                    objG = null;
                }
                if (((R0.e) objG) != null) {
                    accessibilityNodeInfo2.setLiveRegion(i13);
                }
                r10.setClickable(false);
                objG2 = e17.g(R0.i.f7085b);
                if (objG2 == null) {
                    objG2 = null;
                }
                aVar = (R0.a) objG2;
                c10 = 3;
                if (aVar != null) {
                    objG27 = e17.g(R0.s.f7149G);
                    if (objG27 == null) {
                        objG27 = null;
                    }
                    boolean zA3 = p251z9.j.a(objG27, Boolean.TRUE);
                    if (gVar3 == null) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (z16) {
                        z17 = true;
                    } else {
                        if (gVar3 == null) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    r10.setClickable(z18);
                    if (I.a(pVar3)) {
                        gVar.b(new J1.d(16, aVar.f7068a));
                    }
                }
                r10.setLongClickable(false);
                objG3 = e17.g(R0.i.f7086c);
                if (objG3 == null) {
                    objG3 = null;
                }
                aVar2 = (R0.a) objG3;
                if (aVar2 != null) {
                    r10.setLongClickable(true);
                    if (I.a(pVar3)) {
                        gVar.b(new J1.d(32, aVar2.f7068a));
                    }
                }
                objG4 = e17.g(R0.i.f7097p);
                if (objG4 == null) {
                    objG4 = null;
                }
                aVar3 = (R0.a) objG4;
                if (aVar3 != null) {
                    gVar.b(new J1.d(16384, aVar3.f7068a));
                }
                if (I.a(pVar3)) {
                    objG23 = e17.g(R0.i.j);
                    if (objG23 == null) {
                        objG23 = null;
                    }
                    aVar10 = (R0.a) objG23;
                    if (aVar10 != null) {
                        gVar.b(new J1.d(2097152, aVar10.f7068a));
                    }
                    objG24 = e17.g(R0.i.f7096o);
                    if (objG24 == null) {
                        objG24 = null;
                    }
                    aVar11 = (R0.a) objG24;
                    if (aVar11 != null) {
                        gVar.b(new J1.d(android.R.id.accessibilityActionImeEnter, aVar11.f7068a));
                    }
                    objG25 = e17.g(R0.i.f7098q);
                    if (objG25 == null) {
                        objG25 = null;
                    }
                    aVar12 = (R0.a) objG25;
                    if (aVar12 != null) {
                        gVar.b(new J1.d(65536, aVar12.f7068a));
                    }
                    objG26 = e17.g(R0.i.f7099r);
                    if (objG26 == null) {
                        objG26 = null;
                    }
                    aVar13 = (R0.a) objG26;
                    if (aVar13 != null) {
                        primaryClipDescription = androidComposeView2.getClipboardManager().f5075a.getPrimaryClipDescription();
                        if (primaryClipDescription != null) {
                            zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                        } else {
                            zHasMimeType = false;
                        }
                        if (zHasMimeType) {
                            gVar.b(new J1.d(32768, aVar13.f7068a));
                        }
                    }
                }
                strT = E.t(pVar3);
                if (strT != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (z10) {
                    accessibilityNodeInfo2.setTextSelection(e10.r(pVar3), e10.q(pVar3));
                    objG20 = e17.g(R0.i.f7091i);
                    if (objG20 == null) {
                        objG20 = null;
                    }
                    aVar9 = (R0.a) objG20;
                    if (aVar9 != null) {
                        str = aVar9.f7068a;
                    } else {
                        str = null;
                    }
                    gVar.b(new J1.d(131072, str));
                    gVar.a(256);
                    gVar.a(512);
                    r10.setMovementGranularities(11);
                    objG21 = e17.g(R0.s.f7156a);
                    if (objG21 == null) {
                        objG21 = null;
                    }
                    list2 = (List) objG21;
                    if (list2 != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        jVar2 = jVar4;
                    } else {
                        jVar2 = jVar4;
                    }
                } else {
                    jVar2 = jVar4;
                }
                i14 = Build.VERSION.SDK_INT;
                if (i14 >= 26) {
                    arrayList4 = new ArrayList();
                    arrayList4.add("androidx.compose.ui.semantics.id");
                    charSequenceG = gVar.g();
                    if (charSequenceG != null) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        arrayList4.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (e17.c(R0.s.f7177x)) {
                        arrayList4.add("androidx.compose.ui.semantics.testTag");
                    }
                    gVar.j(arrayList4);
                }
                objG5 = e17.g(R0.s.f7158c);
                if (objG5 == null) {
                    objG5 = null;
                }
                fVar = (R0.f) objG5;
                if (fVar != null) {
                    f3 = fVar.f7076a;
                    aVar8 = fVar.f7077b;
                    vVar2 = R0.i.f7090h;
                    if (jVar2.f7108r.c(vVar2)) {
                        gVar.m("android.widget.SeekBar");
                    } else {
                        gVar.m("android.widget.ProgressBar");
                    }
                    if (fVar != R0.f.f7075d) {
                        r10.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(aVar8.f1993a).floatValue(), Float.valueOf(aVar8.f1994b).floatValue(), f3));
                    }
                    if (jVar2.f7108r.c(vVar2)) {
                        fFloatValue = Float.valueOf(aVar8.f1994b).floatValue();
                        fFloatValue2 = Float.valueOf(aVar8.f1993a).floatValue();
                        if (fFloatValue < fFloatValue2) {
                            fFloatValue = fFloatValue2;
                        }
                        if (f3 < fFloatValue) {
                            gVar.b(J1.d.j);
                        }
                        fFloatValue3 = Float.valueOf(aVar8.f1993a).floatValue();
                        fFloatValue4 = Float.valueOf(aVar8.f1994b).floatValue();
                        if (fFloatValue3 > fFloatValue4) {
                            fFloatValue3 = fFloatValue4;
                        }
                        if (f3 > fFloatValue3) {
                            gVar.b(J1.d.f4200k);
                        }
                    }
                }
                if (i14 >= 24) {
                    objG19 = jVar2.f7108r.g(R0.i.f7090h);
                    if (objG19 == null) {
                        objG19 = null;
                    }
                    aVar7 = (R0.a) objG19;
                    if (aVar7 != null) {
                        gVar.b(new J1.d(android.R.id.accessibilityActionSetProgress, aVar7.f7068a));
                    }
                }
                objG6 = pVar3.i().f7108r.g(R0.s.f7161f);
                if (objG6 == null) {
                    objG6 = null;
                }
                bVar = (R0.b) objG6;
                if (bVar != null) {
                    gVar.n(J1.e.a(bVar.f7070a, bVar.f7071b, 0));
                } else {
                    arrayList = new ArrayList();
                    objG7 = pVar3.i().f7108r.g(R0.s.f7160e);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (objG7 != null) {
                        listH = R0.p.h(4, pVar3);
                        size3 = listH.size();
                        i15 = 0;
                        while (i15 < size3) {
                            pVar = (R0.p) listH.get(i15);
                            char c13 = c10;
                            if (pVar.i().f7108r.c(R0.s.f7149G)) {
                                arrayList.add(pVar);
                            }
                            i15++;
                            c10 = c13;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        zC = B0.c.c(arrayList);
                        if (zC) {
                            size = 1;
                        } else {
                            size = arrayList.size();
                        }
                        if (zC) {
                            size2 = arrayList.size();
                        } else {
                            size2 = 1;
                        }
                        gVar.n(J1.e.a(size, size2, 0));
                    }
                }
                objG8 = pVar3.i().f7108r.g(R0.s.g);
                if (objG8 == null) {
                    objG8 = null;
                }
                if (objG8 == null) {
                    throw new ClassCastException();
                }
                pVarJ = pVar3.j();
                if (pVarJ != null) {
                    objG16 = pVarJ.i().f7108r.g(R0.s.f7160e);
                    if (objG16 == null) {
                        objG16 = null;
                    }
                    if (objG16 != null) {
                        objG17 = pVarJ.i().f7108r.g(R0.s.f7161f);
                        if (objG17 == null) {
                            objG17 = null;
                        }
                        bVar2 = (R0.b) objG17;
                        if (bVar2 != null) {
                            if (pVar3.i().f7108r.c(R0.s.f7149G)) {
                                arrayList3 = new ArrayList();
                                listH2 = R0.p.h(4, pVarJ);
                                size5 = listH2.size();
                                i21 = 0;
                                while (i20 < size5) {
                                    pVar2 = (R0.p) listH2.get(i20);
                                    if (pVar2.i().f7108r.c(R0.s.f7149G)) {
                                        arrayList3.add(pVar2);
                                        if (pVar2.f7118c.v() < pVar3.f7118c.v()) {
                                            i21++;
                                        }
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    zC2 = B0.c.c(arrayList3);
                                    if (zC2) {
                                        i22 = 0;
                                    } else {
                                        i22 = i21;
                                    }
                                    if (zC2) {
                                        i23 = i21;
                                    } else {
                                        i23 = 0;
                                    }
                                    objG18 = pVar3.i().f7108r.g(R0.s.f7149G);
                                    if (objG18 == null) {
                                        objG18 = Boolean.FALSE;
                                    }
                                    gVar.o(J1.f.a(i22, 1, i23, 1, false, ((Boolean) objG18).booleanValue()));
                                }
                            }
                        } else if (pVar3.i().f7108r.c(R0.s.f7149G)) {
                            arrayList3 = new ArrayList();
                            listH2 = R0.p.h(4, pVarJ);
                            size5 = listH2.size();
                            i21 = 0;
                            while (i20 < size5) {
                                pVar2 = (R0.p) listH2.get(i20);
                                if (pVar2.i().f7108r.c(R0.s.f7149G)) {
                                    arrayList3.add(pVar2);
                                    if (pVar2.f7118c.v() < pVar3.f7118c.v()) {
                                        i21++;
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                zC2 = B0.c.c(arrayList3);
                                if (zC2) {
                                    i22 = 0;
                                } else {
                                    i22 = i21;
                                }
                                if (zC2) {
                                    i23 = i21;
                                } else {
                                    i23 = 0;
                                }
                                objG18 = pVar3.i().f7108r.g(R0.s.f7149G);
                                if (objG18 == null) {
                                    objG18 = Boolean.FALSE;
                                }
                                gVar.o(J1.f.a(i22, 1, i23, 1, false, ((Boolean) objG18).booleanValue()));
                            }
                        }
                    }
                }
                objG9 = jVar2.f7108r.g(R0.s.f7172s);
                if (objG9 == null) {
                    objG9 = null;
                }
                hVar = (R0.h) objG9;
                objG10 = jVar2.f7108r.g(R0.i.f7087d);
                if (objG10 == null) {
                    objG10 = null;
                }
                R0.a aVar16 = (R0.a) objG10;
                if (hVar != null) {
                    objG14 = pVar3.i().f7108r.g(R0.s.f7161f);
                    if (objG14 == null) {
                        objG14 = null;
                    }
                    if (objG14 == null) {
                        objG15 = pVar3.i().f7108r.g(R0.s.f7160e);
                        if (objG15 == null) {
                            objG15 = null;
                        }
                        if (objG15 != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        gVar.m("android.widget.HorizontalScrollView");
                    }
                    if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                        gVar.v(true);
                    }
                    if (I.a(pVar3)) {
                        if (E.y(hVar)) {
                            gVar.b(J1.d.j);
                            if (I.f(pVar3)) {
                                dVar2 = J1.d.f4208s;
                            } else {
                                dVar2 = J1.d.f4206q;
                            }
                            gVar.b(dVar2);
                        }
                        if (E.x(hVar)) {
                            gVar.b(J1.d.f4200k);
                            if (I.f(pVar3)) {
                                dVar = J1.d.f4206q;
                            } else {
                                dVar = J1.d.f4208s;
                            }
                            gVar.b(dVar);
                        }
                    }
                }
                objG11 = jVar2.f7108r.g(R0.s.f7173t);
                if (objG11 == null) {
                    objG11 = null;
                }
                hVar2 = (R0.h) objG11;
                if (hVar2 != null) {
                    objG12 = pVar3.i().f7108r.g(R0.s.f7161f);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    if (objG12 == null) {
                        objG13 = pVar3.i().f7108r.g(R0.s.f7160e);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        if (objG13 != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        gVar.m("android.widget.ScrollView");
                    }
                    if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                        gVar.v(true);
                    }
                    if (I.a(pVar3)) {
                        if (E.y(hVar2)) {
                            gVar.b(J1.d.j);
                            gVar.b(J1.d.f4207r);
                        }
                        if (E.x(hVar2)) {
                            gVar.b(J1.d.f4200k);
                            gVar.b(J1.d.f4205p);
                        }
                    }
                }
                if (i14 >= 29) {
                    P.c(gVar, pVar3);
                }
                gVar.t((CharSequence) B9.a.D(pVar3.k(), R0.s.f7159d));
                if (I.a(pVar3)) {
                    aVar4 = (R0.a) B9.a.D(pVar3.k(), R0.i.f7100s);
                    if (aVar4 != null) {
                        gVar.b(new J1.d(262144, aVar4.f7068a));
                    }
                    aVar5 = (R0.a) B9.a.D(pVar3.k(), R0.i.f7101t);
                    if (aVar5 != null) {
                        gVar.b(new J1.d(524288, aVar5.f7068a));
                    }
                    aVar6 = (R0.a) B9.a.D(pVar3.k(), R0.i.f7102u);
                    if (aVar6 != null) {
                        gVar.b(new J1.d(1048576, aVar6.f7068a));
                    }
                    jVarK = pVar3.k();
                    vVar = R0.i.f7104w;
                    if (jVarK.f7108r.c(vVar)) {
                        list = (List) pVar3.k().c(vVar);
                        size4 = list.size();
                        sVar = E.f4886P;
                        if (size4 < sVar.f22758b) {
                            throw new IllegalStateException(p245z2.a.E(new StringBuilder("Can't have more than "), sVar.f22758b, " custom actions for one widget"));
                        }
                        u.P p12 = new u.P(0);
                        u.z zVarA2 = u.J.a();
                        if (p10.c(i11)) {
                            zVar = (u.z) p10.d(i11);
                            iArr = sVar.f22757a;
                            i16 = sVar.f22758b;
                            iArr2 = new int[16];
                            i17 = 0;
                            i18 = 0;
                            while (i17 < i16) {
                                int i410 = iArr[i17];
                                int i411 = i16;
                                i19 = i18 + 1;
                                u.z zVar4 = zVar;
                                if (iArr2.length < i19) {
                                    int[] iArrCopyOf2 = Arrays.copyOf(iArr2, Math.max(i19, (iArr2.length * 3) / 2));
                                    p251z9.j.d(iArrCopyOf2, "copyOf(...)");
                                    iArr2 = iArrCopyOf2;
                                }
                                iArr2[i18] = i410;
                                i17++;
                                i18 = i19;
                                i16 = i411;
                                zVar = zVar4;
                            }
                            zVar2 = zVar;
                            arrayList2 = new ArrayList();
                            if (list.size() <= 0) {
                                p245z2.a.H(list.get(0));
                                p251z9.j.b(zVar2);
                                throw null;
                            }
                            if (arrayList2.size() > 0) {
                                p245z2.a.H(arrayList2.get(0));
                                if (i18 > 0) {
                                    int i412 = iArr2[0];
                                    throw null;
                                }
                                p204v.a.d("Index must be between 0 and size");
                                throw null;
                            }
                        } else if (list.size() > 0) {
                            p245z2.a.H(list.get(0));
                            sVar.c(0);
                            throw null;
                        }
                        e10.f4917u.f(i11, p12);
                        p10.f(i11, zVarA2);
                    }
                }
                gVar.u(I.g(pVar3, resources4));
                iD = e10.f4891E.d(i11);
                if (iD != -1) {
                    androidViewHolderR2 = P.r(androidComposeView2.getAndroidViewsHandler$ui_release(), iD);
                    if (androidViewHolderR2 != null) {
                        r10.setTraversalBefore(androidViewHolderR2);
                        androidComposeView = androidComposeView2;
                    } else {
                        androidComposeView = androidComposeView2;
                        r10.setTraversalBefore(androidComposeView, iD);
                    }
                    bundle = null;
                    e10.j(i11, gVar, e10.f4893G, null);
                } else {
                    bundle = null;
                    androidComposeView = androidComposeView2;
                }
                iD2 = e10.f4892F.d(i11);
                if (iD2 != -1) {
                    r10.setTraversalAfter(androidViewHolderR);
                    e10.j(i11, gVar, e10.f4894H, bundle);
                }
            }
        }
        if (e10.f4914r) {
            if (i11 == e10.f4910n) {
                e10.f4912p = gVar;
            }
            if (i11 == e10.f4911o) {
                e10.f4913q = gVar;
            }
        }
        return gVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:157:0x024c  */
    /* JADX WARN: Code duplicated, block: B:248:0x03be  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:255:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:259:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:263:0x03db  */
    /* JADX WARN: Code duplicated, block: B:266:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:267:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:271:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:278:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:285:0x0403  */
    /* JADX WARN: Code duplicated, block: B:288:0x0408  */
    /* JADX WARN: Code duplicated, block: B:290:0x0410  */
    /* JADX WARN: Code duplicated, block: B:293:0x041b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0420  */
    /* JADX WARN: Code duplicated, block: B:298:0x0424  */
    /* JADX WARN: Code duplicated, block: B:300:0x042c  */
    /* JADX WARN: Code duplicated, block: B:301:0x042e  */
    /* JADX WARN: Code duplicated, block: B:305:0x0434  */
    /* JADX WARN: Code duplicated, block: B:308:0x0439  */
    /* JADX WARN: Code duplicated, block: B:310:0x043e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0445  */
    /* JADX WARN: Code duplicated, block: B:315:0x044c  */
    /* JADX WARN: Code duplicated, block: B:316:0x045f  */
    /* JADX WARN: Code duplicated, block: B:318:0x047c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0481  */
    /* JADX WARN: Code duplicated, block: B:326:0x049b  */
    /* JADX WARN: Code duplicated, block: B:329:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:333:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:335:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:338:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x0541  */
    /* JADX WARN: Code duplicated, block: B:380:0x054a  */
    /* JADX WARN: Code duplicated, block: B:383:0x054f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x0553  */
    /* JADX WARN: Code duplicated, block: B:386:0x0558  */
    /* JADX WARN: Code duplicated, block: B:388:0x0565 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:389:0x0567  */
    /* JADX WARN: Code duplicated, block: B:392:0x056e  */
    /* JADX WARN: Code duplicated, block: B:394:0x0576  */
    /* JADX WARN: Code duplicated, block: B:400:0x0593  */
    /* JADX WARN: Code duplicated, block: B:402:0x0597  */
    /* JADX WARN: Code duplicated, block: B:404:0x059f  */
    /* JADX WARN: Code duplicated, block: B:405:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:407:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:409:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:410:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:413:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:503:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:509:0x070d  */
    /* JADX WARN: Code duplicated, block: B:516:0x071f  */
    /* JADX WARN: Code duplicated, block: B:518:0x0723  */
    /* JADX WARN: Code duplicated, block: B:520:0x0736  */
    /* JADX WARN: Code duplicated, block: B:522:0x073a  */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x01ec, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Switch 'out' block B:33:0x0091 for B:50:0x00bd already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:33:0x0091 for B:51:0x00c0 already processed. Defaulting to fallback option. */
    @Override // O8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(int r26, int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 2240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.A.C(int, int, android.os.Bundle):boolean");
    }

    @Override // O8.c
    public void d(int i10, J1.g gVar, String str, Bundle bundle) {
        switch (this.f4863t) {
            case 0:
                ((E) this.f4864u).j(i10, gVar, str, bundle);
                break;
        }
    }

    @Override // O8.c
    public final J1.g k(int i10) {
        switch (this.f4863t) {
            case 0:
                return G(i10);
            default:
                return new J1.g(AccessibilityNodeInfo.obtain(((R1.a) this.f4864u).r(i10).f4219a));
        }
    }

    @Override // O8.c
    public final J1.g o(int i10) {
        switch (this.f4863t) {
            case 0:
                E e10 = (E) this.f4864u;
                if (i10 != 1) {
                    if (i10 == 2) {
                        return k(e10.f4910n);
                    }
                    throw new IllegalArgumentException(p123m2.c.r(i10, "Unknown focus type: "));
                }
                int i11 = e10.f4911o;
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                return k(i11);
            default:
                R1.a aVar = (R1.a) this.f4864u;
                int i12 = i10 == 2 ? aVar.f7193k : aVar.f7194l;
                if (i12 == Integer.MIN_VALUE) {
                    return null;
                }
                return k(i12);
        }
    }
}
