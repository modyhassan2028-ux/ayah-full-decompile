package K0;

import I1.C0243b;
import U0.C0515g;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import u.AbstractC1354i;
import u.AbstractC1355j;
import u.AbstractC1356k;
import u.AbstractC1357l;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C0243b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final u.s f4886P = AbstractC1354i.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4887A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public B f4888B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public u.t f4889C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final u.u f4890D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final u.r f4891E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final u.r f4892F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f4893G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f4894H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final android.support.v4.media.session.r f4895I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final u.t f4896J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public V0 f4897K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f4898L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RunnableC0354l f4899M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ArrayList f4900N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final D f4901O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f4902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4903e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D f4904f = new D(this, 0);
    public final AccessibilityManager g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0377x f4906i;
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0379y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f4907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f4908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f4909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public J1.g f4912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public J1.g f4913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u.t f4915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u.t f4916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u.P f4917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u.P f4918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f4920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1351f f4921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final M9.e f4922z;

    /* JADX WARN: Type inference failed for: r2v4, types: [K0.x] */
    /* JADX WARN: Type inference failed for: r2v5, types: [K0.y] */
    public E(AndroidComposeView androidComposeView) {
        this.f4902d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        p251z9.j.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.f4905h = 100L;
        this.f4906i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: K0.x
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                E e10 = this.f5201r;
                e10.f4907k = z10 ? e10.g.getEnabledAccessibilityServiceList(-1) : p120l9.r.f19440r;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: K0.y
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                E e10 = this.f5204a;
                e10.f4907k = e10.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f4907k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f4908l = new Handler(Looper.getMainLooper());
        this.f4909m = new A(this, 0);
        this.f4910n = Integer.MIN_VALUE;
        this.f4911o = Integer.MIN_VALUE;
        this.f4915s = new u.t();
        this.f4916t = new u.t();
        this.f4917u = new u.P(0);
        this.f4918v = new u.P(0);
        this.f4919w = -1;
        this.f4921y = new C1351f(0);
        this.f4922z = p185s8.u0.a(1, 6, null);
        this.f4887A = true;
        u.t tVar = AbstractC1356k.f22736a;
        p251z9.j.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f4889C = tVar;
        this.f4890D = new u.u();
        this.f4891E = new u.r();
        this.f4892F = new u.r();
        this.f4893G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f4894H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f4895I = new android.support.v4.media.session.r(28);
        this.f4896J = new u.t();
        R0.p pVarA = androidComposeView.getSemanticsOwner().a();
        p251z9.j.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f4897K = new V0(pVarA, tVar);
        androidComposeView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0381z(0, this));
        int i10 = 1;
        this.f4899M = new RunnableC0354l(i10, this);
        this.f4900N = new ArrayList();
        this.f4901O = new D(this, i10);
    }

    public static /* synthetic */ void D(E e10, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        e10.C(i10, i11, num, null);
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                p251z9.j.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(R0.p pVar) {
        C0515g c0515g;
        if (pVar != null) {
            R0.j jVar = pVar.f7119d;
            u.E e10 = jVar.f7108r;
            R0.v vVar = R0.s.f7156a;
            if (e10.c(vVar)) {
                return p086i1.a.a(62, ",", (List) jVar.c(vVar));
            }
            R0.v vVar2 = R0.s.f7146D;
            if (e10.c(vVar2)) {
                Object objG = e10.g(vVar2);
                if (objG == null) {
                    objG = null;
                }
                C0515g c0515g2 = (C0515g) objG;
                if (c0515g2 != null) {
                    return c0515g2.f8060s;
                }
            } else {
                Object objG2 = e10.g(R0.s.f7179z);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (c0515g = (C0515g) p120l9.m.g0(list)) != null) {
                    return c0515g.f8060s;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y9.a, z9.k] */
    public static final boolean w(R0.h hVar, float f3) {
        ?? r10 = hVar.f7080a;
        if (f3 >= 0.0f || ((Number) r10.invoke()).floatValue() <= 0.0f) {
            return f3 > 0.0f && ((Number) r10.invoke()).floatValue() < ((Number) hVar.f7081b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [y9.a, z9.k] */
    public static final boolean x(R0.h hVar) {
        ?? r10 = hVar.f7080a;
        if (((Number) r10.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r10.invoke()).floatValue();
        ((Number) hVar.f7081b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [y9.a, z9.k] */
    public static final boolean y(R0.h hVar) {
        ?? r10 = hVar.f7080a;
        if (((Number) r10.invoke()).floatValue() < ((Number) hVar.f7081b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r10.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[EDGE_INSN: B:42:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void A(R0.p pVar, V0 v10) {
        int[] iArr = AbstractC1357l.f22737a;
        u.u uVar = new u.u();
        List listH = R0.p.h(4, pVar);
        J0.I i10 = pVar.f7118c;
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            R0.p pVar2 = (R0.p) listH.get(i11);
            AbstractC1355j abstractC1355jS = s();
            int i12 = pVar2.g;
            if (abstractC1355jS.a(i12)) {
                if (!v10.f5027b.b(i12)) {
                    v(i10);
                    return;
                }
                uVar.a(i12);
            }
        }
        u.u uVar2 = v10.f5027b;
        int[] iArr2 = uVar2.f22761b;
        long[] jArr = uVar2.f22760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j = jArr[i13];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j) < 128 && !uVar.b(iArr2[(i13 << 3) + i15])) {
                            v(i10);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        List listH2 = R0.p.h(4, pVar);
        int size2 = listH2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            R0.p pVar3 = (R0.p) listH2.get(i16);
            if (s().a(pVar3.g)) {
                Object objB = this.f4896J.b(pVar3.g);
                p251z9.j.b(objB);
                A(pVar3, (V0) objB);
            }
        }
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f4914r = true;
        }
        try {
            return ((Boolean) this.f4904f.e(accessibilityEvent)).booleanValue();
        } finally {
            this.f4914r = false;
        }
    }

    public final boolean C(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i10, i11);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(p086i1.a.a(62, ",", list));
        }
        return B(accessibilityEventO);
    }

    public final void E(String str, int i10, int i11) {
        AccessibilityEvent accessibilityEventO = o(z(i10), 32);
        accessibilityEventO.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        B(accessibilityEventO);
    }

    public final void F(int i10) {
        B b5 = this.f4888B;
        if (b5 != null) {
            R0.p pVar = b5.f4866a;
            if (i10 != pVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - b5.f4871f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(z(pVar.g), 131072);
                accessibilityEventO.setFromIndex(b5.f4869d);
                accessibilityEventO.setToIndex(b5.f4870e);
                accessibilityEventO.setAction(b5.f4867b);
                accessibilityEventO.setMovementGranularity(b5.f4868c);
                accessibilityEventO.getText().add(t(pVar));
                B(accessibilityEventO);
            }
        }
        this.f4888B = null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16811. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void G(u.AbstractC1355j r59) {
        /*
            Method dump skipped, instruction units count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.E.G(u.j):void");
    }

    public final void H(J0.I i10, u.u uVar) {
        R0.j jVarW;
        if (i10.H() && !this.f4902d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(i10)) {
            J0.I i11 = null;
            if (!i10.f3914W.g(8)) {
                i10 = i10.u();
                while (true) {
                    if (i10 == null) {
                        i10 = null;
                        break;
                    } else if (i10.f3914W.g(8)) {
                        break;
                    } else {
                        i10 = i10.u();
                    }
                }
            }
            if (i10 == null || (jVarW = i10.w()) == null) {
                return;
            }
            if (!jVarW.f7110t) {
                for (J0.I iU = i10.u(); iU != null; iU = iU.u()) {
                    R0.j jVarW2 = iU.w();
                    if (jVarW2 != null && jVarW2.f7110t) {
                        i11 = iU;
                        break;
                    }
                }
                if (i11 != null) {
                    i10 = i11;
                }
            }
            int i12 = i10.f3926s;
            if (uVar.a(i12)) {
                D(this, z(i12), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r0v18, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [y9.a, z9.k] */
    public final void I(J0.I i10) {
        if (i10.H() && !this.f4902d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(i10)) {
            int i11 = i10.f3926s;
            R0.h hVar = (R0.h) this.f4915s.b(i11);
            R0.h hVar2 = (R0.h) this.f4916t.b(i11);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i11, 4096);
            if (hVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) hVar.f7080a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) hVar.f7081b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) hVar2.f7080a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) hVar2.f7081b.invoke()).floatValue());
            }
            B(accessibilityEventO);
        }
    }

    public final boolean J(R0.p pVar, int i10, int i11, boolean z10) {
        String strT;
        R0.j jVar = pVar.f7119d;
        int i12 = pVar.g;
        R0.v vVar = R0.i.f7091i;
        if (jVar.f7108r.c(vVar) && I.a(pVar)) {
            p241y9.f fVar = (p241y9.f) ((R0.a) pVar.f7119d.c(vVar)).f7069b;
            if (fVar != null) {
                return ((Boolean) fVar.d(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f4919w) && (strT = t(pVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strT.length()) {
                i10 = -1;
            }
            this.f4919w = i10;
            boolean z11 = strT.length() > 0;
            B(p(z(i12), z11 ? Integer.valueOf(this.f4919w) : null, z11 ? Integer.valueOf(this.f4919w) : null, z11 ? Integer.valueOf(strT.length()) : null, strT));
            F(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        long j;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i10;
        int iNumberOfTrailingZeros;
        char c11;
        V0 v10;
        u.u uVar = new u.u();
        u.u uVar2 = this.f4890D;
        int[] iArr = uVar2.f22761b;
        long[] jArr3 = uVar2.f22760a;
        int length = jArr3.length - 2;
        u.t tVar = this.f4896J;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            j = 128;
            j10 = 255;
            while (true) {
                long j13 = jArr3[i12];
                char c12 = 7;
                j11 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            int i15 = iArr[(i12 << 3) + i14];
                            c11 = c12;
                            W0 w9 = (W0) s().b(i15);
                            Object obj = null;
                            R0.p pVar = w9 != null ? w9.f5032a : null;
                            if (pVar != null) {
                                if (!pVar.f7119d.f7108r.c(R0.s.f7159d)) {
                                    uVar.a(i15);
                                    v10 = (V0) tVar.b(i15);
                                    if (v10 != null) {
                                        Object objG = v10.f5026a.f7108r.g(R0.s.f7159d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    E(obj, i15, 32);
                                }
                            } else {
                                uVar.a(i15);
                                v10 = (V0) tVar.b(i15);
                                if (v10 != null) {
                                    Object objG2 = v10.f5026a.f7108r.g(R0.s.f7159d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                E(obj, i15, 32);
                            }
                        } else {
                            c11 = c12;
                        }
                        j13 >>= 8;
                        i14++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            j = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
        }
        int[] iArr2 = uVar.f22761b;
        long[] jArr4 = uVar.f22760a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j14 = jArr4[i16];
                if ((((~j14) << c10) & j14 & j11) != j11) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & j10) < j) {
                            int i19 = iArr2[(i16 << 3) + i18];
                            int i20 = (-862048943) * i19;
                            int i21 = i20 ^ (i20 << 16);
                            int i22 = i21 & 127;
                            int i23 = uVar2.f22762c;
                            int i24 = (i21 >>> 7) & i23;
                            i10 = i11;
                            int i25 = 0;
                            while (true) {
                                long[] jArr5 = uVar2.f22760a;
                                int i26 = i24 >> 3;
                                jArr2 = jArr4;
                                int i27 = (i24 & 7) << 3;
                                j12 = j14;
                                long j15 = (jArr5[i26] >>> i27) | ((jArr5[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                                int i28 = i23;
                                long j16 = (((long) i22) * 72340172838076673L) ^ j15;
                                long j17 = (j16 - 72340172838076673L) & (~j16) & j11;
                                while (j17 != 0) {
                                    iNumberOfTrailingZeros = (i24 + (Long.numberOfTrailingZeros(j17) >> 3)) & i28;
                                    int i29 = i28;
                                    if (uVar2.f22761b[iNumberOfTrailingZeros] == i19) {
                                        break;
                                    }
                                    j17 &= j17 - 1;
                                    i28 = i29;
                                }
                                int i30 = i28;
                                if ((j15 & ((~j15) << 6) & j11) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i25 += 8;
                                i24 = (i24 + i25) & i30;
                                jArr4 = jArr2;
                                i23 = i30;
                                j14 = j12;
                            }
                            int i31 = iNumberOfTrailingZeros;
                            if (i31 >= 0) {
                                uVar2.f(i31);
                            }
                        } else {
                            jArr2 = jArr4;
                            j12 = j14;
                            i10 = i11;
                        }
                        j14 = j12 >> i10;
                        i18++;
                        i11 = i10;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i17 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                jArr4 = jArr;
                i11 = 8;
            }
        }
        tVar.c();
        AbstractC1355j abstractC1355jS = s();
        int[] iArr3 = abstractC1355jS.f22732b;
        Object[] objArr = abstractC1355jS.f22733c;
        long[] jArr6 = abstractC1355jS.f22731a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i32 = 0;
            while (true) {
                long j18 = jArr6[i32];
                if ((((~j18) << c10) & j18 & j11) != j11) {
                    int i33 = 8 - ((~(i32 - length3)) >>> 31);
                    for (int i34 = 0; i34 < i33; i34++) {
                        if ((j18 & j10) < j) {
                            int i35 = (i32 << 3) + i34;
                            int i36 = iArr3[i35];
                            R0.p pVar2 = ((W0) objArr[i35]).f5032a;
                            R0.j jVar = pVar2.f7119d;
                            R0.v vVar = R0.s.f7159d;
                            if (jVar.f7108r.c(vVar) && uVar2.a(i36)) {
                                E((String) pVar2.f7119d.c(vVar), i36, 16);
                            }
                            tVar.h(i36, new V0(pVar2, s()));
                        }
                        j18 >>= 8;
                    }
                    if (i33 != 8) {
                        break;
                    }
                }
                if (i32 == length3) {
                    break;
                } else {
                    i32++;
                }
            }
        }
        this.f4897K = new V0(this.f4902d.getSemanticsOwner().a(), s());
    }

    @Override // I1.C0243b
    public final O8.c b(View view) {
        return this.f4909m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i10, J1.g gVar, String str, Bundle bundle) {
        R0.p pVar;
        p171r0.e eVar;
        RectF rectF;
        p171r0.e eVarD;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        W0 w9 = (W0) s().b(i10);
        if (w9 == null || (pVar = w9.f5032a) == null) {
            return;
        }
        R0.j jVar = pVar.f7119d;
        u.E e10 = jVar.f7108r;
        String strT = t(pVar);
        if (p251z9.j.a(str, this.f4893G)) {
            int iD = this.f4891E.d(i10);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (p251z9.j.a(str, this.f4894H)) {
            int iD2 = this.f4892F.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        J0.j0 j0Var = null;
        if (!e10.c(R0.i.f7084a) || bundle == null || !p251z9.j.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            R0.v vVar = R0.s.f7177x;
            if (!e10.c(vVar) || bundle == null || !p251z9.j.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (p251z9.j.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, pVar.g);
                    return;
                }
                return;
            } else {
                Object objG = e10.g(vVar);
                String str2 = (String) (objG == null ? null : objG);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                U0.I i13 = P.i(jVar);
                if (i13 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                while (i14 < i12) {
                    int i15 = i11 + i14;
                    if (i15 >= i13.f8023a.f8015a.f8060s.length()) {
                        arrayList.add(j0Var);
                        i14 = i14;
                    } else {
                        p171r0.e eVarB = i13.b(i15);
                        J0.j0 j0VarC = pVar.c();
                        long jG = 0;
                        if (j0VarC != null) {
                            if (!j0VarC.E0().f19338E) {
                                j0VarC = j0Var;
                            }
                            if (j0VarC != null) {
                                jG = j0VarC.G(0L);
                            }
                        }
                        p171r0.e eVarH = eVarB.h(jG);
                        p171r0.e eVarE = pVar.e();
                        if (eVarH.f(eVarE)) {
                            eVarD = eVarH.d(eVarE);
                        } else {
                            eVar = j0Var;
                        }
                        if (eVar != 0) {
                            eVar = eVarD;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(eVar.f21390b)) & 4294967295L) | (((long) Float.floatToRawIntBits(eVar.f21389a)) << 32);
                            AndroidComposeView androidComposeView = this.f4902d;
                            long jX = androidComposeView.x(jFloatToRawIntBits);
                            long jX2 = androidComposeView.x((((long) Float.floatToRawIntBits(eVar.f21392d)) & 4294967295L) | (((long) Float.floatToRawIntBits(eVar.f21391c)) << 32));
                            rectF = new RectF(Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)), Float.intBitsToFloat((int) (jX2 >> 32)), Float.intBitsToFloat((int) (jX2 & 4294967295L)));
                        } else {
                            eVar = eVarD;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i14++;
                    j0Var = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(W0 w9) {
        Rect rect = w9.f5033b;
        float f3 = rect.left;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rect.top)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        AndroidComposeView androidComposeView = this.f4902d;
        long jX = androidComposeView.x(jFloatToRawIntBits);
        long jX2 = androidComposeView.x((((long) Float.floatToRawIntBits(rect.right)) << 32) | (((long) Float.floatToRawIntBits(rect.bottom)) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jX >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jX & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jX2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jX2 & 4294967295L))));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[Catch: all -> 0x0037, LOOP:0: B:35:0x008c->B:36:0x008e, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (K9.AbstractC0405x.k(r4, r2) == r6) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fa -> B:48:0x00fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(q9.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.E.l(q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Type inference failed for: r1v22, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r2v7, types: [y9.a, z9.k] */
    public final boolean m(boolean z10, int i10, long j) {
        R0.v vVar;
        int i11;
        if (!p251z9.j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC1355j abstractC1355jS = s();
        if (p171r0.c.b(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            vVar = R0.s.f7173t;
        } else {
            if (z10) {
                throw new A6.a();
            }
            vVar = R0.s.f7172s;
        }
        Object[] objArr = abstractC1355jS.f22733c;
        long[] jArr = abstractC1355jS.f22731a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j10) < 128) {
                        W0 w9 = (W0) objArr[(i12 << 3) + i15];
                        Rect rect = w9.f5033b;
                        float f3 = rect.left;
                        i11 = i13;
                        float f7 = rect.top;
                        float f10 = rect.right;
                        float f11 = rect.bottom;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((fIntBitsToFloat2 < f11) & (fIntBitsToFloat >= f3) & (fIntBitsToFloat < f10) & (fIntBitsToFloat2 >= f7)) {
                            Object objG = w9.f5032a.f7119d.f7108r.g(vVar);
                            if (objG == null) {
                                objG = null;
                            }
                            R0.h hVar = (R0.h) objG;
                            if (hVar != null) {
                                ?? r10 = hVar.f7080a;
                                if (i10 < 0) {
                                    if (((Number) r10.invoke()).floatValue() > 0.0f) {
                                        z11 = true;
                                    }
                                } else if (((Number) r10.invoke()).floatValue() < ((Number) hVar.f7081b.invoke()).floatValue()) {
                                    z11 = true;
                                }
                            }
                        }
                    } else {
                        i11 = i13;
                    }
                    j10 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return z11;
                }
            }
            if (i12 == length) {
                return z11;
            }
            i12++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.f4902d.getSemanticsOwner().a(), this.f4897K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i10, int i11) {
        W0 w9;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f4902d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i10);
        if (u() && (w9 = (W0) s().b(i10)) != null) {
            accessibilityEventObtain.setPassword(w9.f5032a.f7119d.f7108r.c(R0.s.f7151I));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i10, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(R0.p pVar) {
        R0.j jVar = pVar.f7119d;
        R0.j jVar2 = pVar.f7119d;
        R0.v vVar = R0.s.f7156a;
        if (!jVar.f7108r.c(R0.s.f7156a)) {
            R0.v vVar2 = R0.s.f7147E;
            if (jVar2.f7108r.c(vVar2)) {
                return (int) (((U0.K) jVar2.c(vVar2)).f8035a & 4294967295L);
            }
        }
        return this.f4919w;
    }

    public final int r(R0.p pVar) {
        R0.j jVar = pVar.f7119d;
        R0.j jVar2 = pVar.f7119d;
        R0.v vVar = R0.s.f7156a;
        if (!jVar.f7108r.c(R0.s.f7156a)) {
            R0.v vVar2 = R0.s.f7147E;
            if (jVar2.f7108r.c(vVar2)) {
                return (int) (((U0.K) jVar2.c(vVar2)).f8035a >> 32);
            }
        }
        return this.f4919w;
    }

    public final AbstractC1355j s() {
        if (this.f4887A) {
            this.f4887A = false;
            AndroidComposeView androidComposeView = this.f4902d;
            this.f4889C = P.g(androidComposeView.getSemanticsOwner());
            if (u()) {
                u.t tVar = this.f4889C;
                Resources resources = androidComposeView.getContext().getResources();
                Comparator[] comparatorArr = I.f4946a;
                u.r rVar = this.f4891E;
                rVar.a();
                u.r rVar2 = this.f4892F;
                rVar2.a();
                W0 w9 = (W0) tVar.b(-1);
                R0.p pVar = w9 != null ? w9.f5032a : null;
                p251z9.j.b(pVar);
                ArrayList arrayListH = I.h(I.f(pVar), AbstractC0813f2.K(pVar), tVar, resources);
                int iE = AbstractC0813f2.E(arrayListH);
                int i10 = 1;
                if (1 <= iE) {
                    while (true) {
                        int i11 = ((R0.p) arrayListH.get(i10 - 1)).g;
                        int i12 = ((R0.p) arrayListH.get(i10)).g;
                        rVar.f(i11, i12);
                        rVar2.f(i12, i11);
                        if (i10 == iE) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.f4889C;
    }

    public final boolean u() {
        return this.g.isEnabled() && !this.f4907k.isEmpty();
    }

    public final void v(J0.I i10) {
        if (this.f4921y.add(i10)) {
            this.f4922z.k(p110k9.y.f19095a);
        }
    }

    public final int z(int i10) {
        if (i10 == this.f4902d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i10;
    }
}
