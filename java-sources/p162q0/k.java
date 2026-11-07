package p162q0;

import A.C0023i;
import B0.d;
import E5.c;
import F.j;
import F2.t;
import G0.a;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.I;
import J0.InterfaceC0290m;
import J0.z0;
import K0.C0362p;
import K0.C0364q;
import R0.i;
import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import java.util.ArrayList;
import l0.q;
import p011b0.e;
import p063g1.m;
import p120l9.l;
import p122m0.b;
import p251z9.v;
import u.A;
import u.M;
import u.x;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0362p f21200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f21202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f21203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0364q f21204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f21205f = new t(2, null, 6);
    public final g g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f21206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f21207i;
    public x j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A f21208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f21209l;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public k(c cVar, C0362p c0362p, c cVar2, t tVar, t tVar2, C0364q c0364q) {
        this.f21200a = c0362p;
        this.f21201b = cVar2;
        this.f21202c = tVar;
        this.f21203d = tVar2;
        this.f21204e = c0364q;
        int i10 = 0;
        this.g = new g(cVar, new t(i10, this, k.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 0, 20), new j(0, 3, k.class, this, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;"), new C0364q(i10, 1, k.class, this, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"));
        u uVar = new u();
        M.b();
        this.f21206h = uVar;
        this.f21207i = new AbstractC0274a0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f11942a.f21205f.hashCode();
            }

            @Override // J0.AbstractC0274a0
            public final q k() {
                return this.f11942a.f21205f;
            }

            @Override // J0.AbstractC0274a0
            public final /* bridge */ /* synthetic */ void l(q qVar) {
            }
        };
        this.f21208k = new A(1);
    }

    public final boolean a(boolean z10) {
        C0280d0 c0280d0;
        t tVar = this.f21209l;
        if (tVar != null) {
            f(null);
            s sVar = s.f21228r;
            s sVar2 = s.f21231u;
            tVar.v0(sVar, sVar2);
            if (!tVar.f19339r.f19338E) {
                a.b("visitAncestors called on an unattached node");
            }
            q qVar = tVar.f19339r.f19343v;
            I iX = AbstractC0283f.x(tVar);
            while (iX != null) {
                if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f19341t & 1024) != 0) {
                            e eVar = null;
                            q qVarF = qVar;
                            while (qVarF != null) {
                                if (qVarF instanceof t) {
                                    ((t) qVarF).v0(s.f21229s, sVar2);
                                } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i10 = 0;
                                    for (q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                        if ((qVar2.f19341t & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar);
                            }
                        }
                        qVar = qVar.f19343v;
                    }
                }
                iX = iX.u();
                qVar = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            }
        }
        return true;
    }

    public final boolean b(int i10, boolean z10, boolean z11) {
        int iOrdinal;
        boolean z12 = true;
        if (z10 || (iOrdinal = f.t(this.f21205f, i10).ordinal()) == 0) {
            a(z10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new A6.a();
            }
            z12 = false;
        }
        if (z12 && z11) {
            this.f21202c.invoke();
        }
        return z12;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x015a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:315:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x014c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[ADDED_TO_REGION, LOOP:12: B:41:0x007b->B:69:0x00c7, LOOP_START, PHI: r7
      0x007b: PHI (r7v29 l0.q) = (r7v23 l0.q), (r7v30 l0.q) binds: [B:40:0x0079, B:69:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0105 A[ADDED_TO_REGION, LOOP:16: B:87:0x0105->B:115:0x0151, LOOP_START, PHI: r1
      0x0105: PHI (r1v15 l0.q) = (r1v9 l0.q), (r1v16 l0.q) binds: [B:86:0x0103, B:115:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0107 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0116 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r7v39 */
    public final boolean c(KeyEvent keyEvent, p241y9.a aVar) {
        q qVar;
        I iX;
        InterfaceC0290m interfaceC0290m;
        InterfaceC0290m interfaceC0290m2;
        q qVar2;
        C0280d0 c0280d0;
        q qVarF;
        e eVar;
        q qVar3;
        I iX2;
        InterfaceC0290m interfaceC0290m3;
        InterfaceC0290m interfaceC0290m4;
        C0280d0 c0280d1;
        e eVar2;
        q qVarF2;
        int size;
        C0280d0 c0280d2;
        t tVar = this.f21205f;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.g.f21198f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!g(keyEvent)) {
                Trace.endSection();
                return false;
            }
            t tVarG = f.g(tVar);
            if (tVarG != null) {
                if (!tVarG.f19339r.f19338E) {
                    a.b("visitLocalDescendants called on an unattached node");
                }
                q qVar4 = tVarG.f19339r;
                if ((qVar4.f19342u & 9216) != 0) {
                    qVar2 = null;
                    for (q qVar5 = qVar4.f19344w; qVar5 != null; qVar5 = qVar5.f19344w) {
                        int i10 = qVar5.f19341t;
                        if ((i10 & 9216) != 0) {
                            if ((i10 & 1024) != 0) {
                                break;
                            }
                            qVar2 = qVar5;
                        }
                    }
                } else {
                    qVar2 = null;
                }
                if (qVar2 == null) {
                    if (tVarG == null) {
                        if (!tVar.f19339r.f19338E) {
                            a.b("visitAncestors called on an unattached node");
                        }
                        qVar = tVar.f19339r.f19343v;
                        iX = AbstractC0283f.x(tVar);
                        loop15: while (true) {
                            if (iX != null) {
                                interfaceC0290m = null;
                                break;
                            }
                            if ((((q) iX.f3914W.f4067f).f19342u & 8192) != 0) {
                                while (qVar != null) {
                                    if ((qVar.f19341t & 8192) != 0) {
                                        qVarF = qVar;
                                        eVar = null;
                                        while (qVarF != null) {
                                            if (qVarF instanceof d) {
                                                interfaceC0290m = qVarF;
                                                break loop15;
                                            }
                                            if ((qVarF.f19341t & 8192) == 0) {
                                            }
                                            qVarF = AbstractC0283f.f(eVar);
                                        }
                                    }
                                    qVar = qVar.f19343v;
                                }
                            }
                            iX = iX.u();
                            if (iX != null) {
                            }
                        }
                        interfaceC0290m2 = (d) interfaceC0290m;
                        if (interfaceC0290m2 != null) {
                            qVar2 = ((q) interfaceC0290m2).f19339r;
                        } else {
                            qVar2 = null;
                        }
                    } else {
                        if (!tVarG.f19339r.f19338E) {
                            a.b("visitAncestors called on an unattached node");
                        }
                        qVar3 = tVarG.f19339r;
                        iX2 = AbstractC0283f.x(tVarG);
                        loop11: while (true) {
                            if (iX2 != null) {
                                interfaceC0290m3 = null;
                                break;
                            }
                            if ((((q) iX2.f3914W.f4067f).f19342u & 8192) != 0) {
                                while (qVar3 != null) {
                                    if ((qVar3.f19341t & 8192) != 0) {
                                        eVar2 = null;
                                        qVarF2 = qVar3;
                                        while (qVarF2 != null) {
                                            if (qVarF2 instanceof d) {
                                                interfaceC0290m3 = qVarF2;
                                                break loop11;
                                            }
                                            if ((qVarF2.f19341t & 8192) == 0) {
                                            }
                                            qVarF2 = AbstractC0283f.f(eVar2);
                                        }
                                    }
                                    qVar3 = qVar3.f19343v;
                                }
                            }
                            iX2 = iX2.u();
                            if (iX2 != null) {
                            }
                        }
                        interfaceC0290m4 = (d) interfaceC0290m3;
                        if (interfaceC0290m4 != null) {
                            qVar2 = ((q) interfaceC0290m4).f19339r;
                        } else {
                            if (!tVar.f19339r.f19338E) {
                                a.b("visitAncestors called on an unattached node");
                            }
                            qVar = tVar.f19339r.f19343v;
                            iX = AbstractC0283f.x(tVar);
                            loop15: while (true) {
                                if (iX != null) {
                                    interfaceC0290m = null;
                                    break;
                                }
                                if ((((q) iX.f3914W.f4067f).f19342u & 8192) != 0) {
                                    while (qVar != null) {
                                        if ((qVar.f19341t & 8192) != 0) {
                                            qVarF = qVar;
                                            eVar = null;
                                            while (qVarF != null) {
                                                if (qVarF instanceof d) {
                                                    interfaceC0290m = qVarF;
                                                    break loop15;
                                                }
                                                if ((qVarF.f19341t & 8192) == 0) {
                                                }
                                                qVarF = AbstractC0283f.f(eVar);
                                            }
                                        }
                                        qVar = qVar.f19343v;
                                    }
                                }
                                iX = iX.u();
                                if (iX != null) {
                                }
                            }
                            interfaceC0290m2 = (d) interfaceC0290m;
                            if (interfaceC0290m2 != null) {
                                qVar2 = ((q) interfaceC0290m2).f19339r;
                            } else {
                                qVar2 = null;
                            }
                        }
                    }
                }
            } else if (tVarG == null) {
                if (!tVar.f19339r.f19338E) {
                    a.b("visitAncestors called on an unattached node");
                }
                qVar = tVar.f19339r.f19343v;
                iX = AbstractC0283f.x(tVar);
                loop15: while (true) {
                    if (iX != null) {
                        interfaceC0290m = null;
                        break;
                    }
                    if ((((q) iX.f3914W.f4067f).f19342u & 8192) != 0) {
                        while (qVar != null) {
                            if ((qVar.f19341t & 8192) != 0) {
                                qVarF = qVar;
                                eVar = null;
                                while (qVarF != null) {
                                    if (qVarF instanceof d) {
                                        interfaceC0290m = qVarF;
                                        break loop15;
                                    }
                                    if ((qVarF.f19341t & 8192) == 0 && (qVarF instanceof AbstractC0291n)) {
                                        q qVar6 = ((AbstractC0291n) qVarF).f4151G;
                                        int i11 = 0;
                                        while (qVar6 != null) {
                                            if ((qVar6.f19341t & 8192) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    qVarF = qVarF;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    qVarF = qVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new e(new q[16]);
                                                    }
                                                    if (qVarF != null) {
                                                        eVar.b(qVarF);
                                                        qVarF = null;
                                                    }
                                                    eVar.b(qVar6);
                                                }
                                            } else {
                                                qVarF = qVarF;
                                                eVar = eVar;
                                            }
                                            qVar6 = qVar6.f19344w;
                                            qVarF = qVarF;
                                            eVar = eVar;
                                        }
                                        if (i11 == 1) {
                                            qVarF = qVarF;
                                            eVar = eVar;
                                        } else {
                                            qVarF = qVarF;
                                            eVar = eVar;
                                        }
                                    }
                                    qVarF = AbstractC0283f.f(eVar);
                                }
                            }
                            qVar = qVar.f19343v;
                        }
                    }
                    iX = iX.u();
                    qVar = (iX != null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
                }
                interfaceC0290m2 = (d) interfaceC0290m;
                if (interfaceC0290m2 != null) {
                    qVar2 = ((q) interfaceC0290m2).f19339r;
                } else {
                    qVar2 = null;
                }
            } else {
                if (!tVarG.f19339r.f19338E) {
                    a.b("visitAncestors called on an unattached node");
                }
                qVar3 = tVarG.f19339r;
                iX2 = AbstractC0283f.x(tVarG);
                loop11: while (true) {
                    if (iX2 != null) {
                        interfaceC0290m3 = null;
                        break;
                    }
                    if ((((q) iX2.f3914W.f4067f).f19342u & 8192) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.f19341t & 8192) != 0) {
                                eVar2 = null;
                                qVarF2 = qVar3;
                                while (qVarF2 != null) {
                                    if (qVarF2 instanceof d) {
                                        interfaceC0290m3 = qVarF2;
                                        break loop11;
                                    }
                                    if ((qVarF2.f19341t & 8192) == 0 && (qVarF2 instanceof AbstractC0291n)) {
                                        q qVar7 = ((AbstractC0291n) qVarF2).f4151G;
                                        int i12 = 0;
                                        while (qVar7 != null) {
                                            if ((qVar7.f19341t & 8192) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    qVarF2 = qVarF2;
                                                    eVar2 = eVar2;
                                                    eVar2 = eVar2;
                                                    qVarF2 = qVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new e(new q[16]);
                                                    }
                                                    if (qVarF2 != null) {
                                                        eVar2.b(qVarF2);
                                                        qVarF2 = null;
                                                    }
                                                    eVar2.b(qVar7);
                                                }
                                            } else {
                                                qVarF2 = qVarF2;
                                                eVar2 = eVar2;
                                            }
                                            qVar7 = qVar7.f19344w;
                                            qVarF2 = qVarF2;
                                            eVar2 = eVar2;
                                        }
                                        if (i12 == 1) {
                                            qVarF2 = qVarF2;
                                            eVar2 = eVar2;
                                        } else {
                                            qVarF2 = qVarF2;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    qVarF2 = AbstractC0283f.f(eVar2);
                                }
                            }
                            qVar3 = qVar3.f19343v;
                        }
                    }
                    iX2 = iX2.u();
                    qVar3 = (iX2 != null || (c0280d1 = iX2.f3914W) == null) ? null : (z0) c0280d1.f4066e;
                }
                interfaceC0290m4 = (d) interfaceC0290m3;
                if (interfaceC0290m4 != null) {
                    qVar2 = ((q) interfaceC0290m4).f19339r;
                } else {
                    if (!tVar.f19339r.f19338E) {
                        a.b("visitAncestors called on an unattached node");
                    }
                    qVar = tVar.f19339r.f19343v;
                    iX = AbstractC0283f.x(tVar);
                    loop15: while (true) {
                        if (iX != null) {
                            interfaceC0290m = null;
                            break;
                        }
                        if ((((q) iX.f3914W.f4067f).f19342u & 8192) != 0) {
                            while (qVar != null) {
                                if ((qVar.f19341t & 8192) != 0) {
                                    qVarF = qVar;
                                    eVar = null;
                                    while (qVarF != null) {
                                        if (qVarF instanceof d) {
                                            interfaceC0290m = qVarF;
                                            break loop15;
                                        }
                                        if ((qVarF.f19341t & 8192) == 0) {
                                        }
                                        qVarF = AbstractC0283f.f(eVar);
                                    }
                                }
                                qVar = qVar.f19343v;
                            }
                        }
                        iX = iX.u();
                        if (iX != null) {
                        }
                    }
                    interfaceC0290m2 = (d) interfaceC0290m;
                    if (interfaceC0290m2 != null) {
                        qVar2 = ((q) interfaceC0290m2).f19339r;
                    } else {
                        qVar2 = null;
                    }
                }
            }
            if (qVar2 != null) {
                if (!qVar2.f19339r.f19338E) {
                    a.b("visitAncestors called on an unattached node");
                }
                q qVar8 = qVar2.f19339r.f19343v;
                I iX3 = AbstractC0283f.x(qVar2);
                ArrayList arrayList = null;
                while (iX3 != null) {
                    if ((((q) iX3.f3914W.f4067f).f19342u & 8192) != 0) {
                        while (qVar8 != null) {
                            if ((qVar8.f19341t & 8192) != 0) {
                                q qVarF3 = qVar8;
                                e eVar3 = null;
                                while (qVarF3 != null) {
                                    if (qVarF3 instanceof d) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(qVarF3);
                                    } else if ((qVarF3.f19341t & 8192) != 0 && (qVarF3 instanceof AbstractC0291n)) {
                                        int i13 = 0;
                                        for (q qVar9 = ((AbstractC0291n) qVarF3).f4151G; qVar9 != null; qVar9 = qVar9.f19344w) {
                                            if ((qVar9.f19341t & 8192) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    qVarF3 = qVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new e(new q[16]);
                                                    }
                                                    if (qVarF3 != null) {
                                                        eVar3.b(qVarF3);
                                                        qVarF3 = null;
                                                    }
                                                    eVar3.b(qVar9);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    qVarF3 = AbstractC0283f.f(eVar3);
                                }
                            }
                            qVar8 = qVar8.f19343v;
                        }
                    }
                    iX3 = iX3.u();
                    qVar8 = (iX3 == null || (c0280d2 = iX3.f3914W) == null) ? null : (z0) c0280d2.f4066e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i14 = size - 1;
                        if (((d) arrayList.get(size)).l(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i14 < 0) {
                            break;
                        }
                        size = i14;
                    }
                }
                ?? F10 = qVar2.f19339r;
                ?? eVar4 = 0;
                while (F10 != 0) {
                    if (F10 instanceof d) {
                        if (((d) F10).l(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((F10.f19341t & 8192) != 0 && (F10 instanceof AbstractC0291n)) {
                        q qVar10 = ((AbstractC0291n) F10).f4151G;
                        int i15 = 0;
                        while (qVar10 != null) {
                            if ((qVar10.f19341t & 8192) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    F10 = F10;
                                    eVar4 = eVar4;
                                    eVar4 = eVar4;
                                    F10 = qVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new e(new q[16]);
                                    }
                                    if (F10 != 0) {
                                        eVar4.b(F10);
                                        F10 = 0;
                                    }
                                    eVar4.b(qVar10);
                                }
                            } else {
                                F10 = F10;
                                eVar4 = eVar4;
                            }
                            qVar10 = qVar10.f19344w;
                            F10 = F10;
                            eVar4 = eVar4;
                        }
                        if (i15 == 1) {
                            F10 = F10;
                            eVar4 = eVar4;
                        } else {
                            F10 = F10;
                            eVar4 = eVar4;
                        }
                    }
                    F10 = AbstractC0283f.f(eVar4);
                }
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? F11 = qVar2.f19339r;
                ?? eVar5 = 0;
                while (F11 != 0) {
                    if (F11 instanceof d) {
                        if (((d) F11).F(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((F11.f19341t & 8192) != 0 && (F11 instanceof AbstractC0291n)) {
                        q qVar11 = ((AbstractC0291n) F11).f4151G;
                        int i16 = 0;
                        while (qVar11 != null) {
                            if ((qVar11.f19341t & 8192) != 0) {
                                i16++;
                                if (i16 == 1) {
                                    eVar5 = eVar5;
                                    F11 = F11;
                                    eVar5 = eVar5;
                                    F11 = qVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new e(new q[16]);
                                    }
                                    if (F11 != 0) {
                                        eVar5.b(F11);
                                        F11 = 0;
                                    }
                                    eVar5.b(qVar11);
                                }
                            } else {
                                eVar5 = eVar5;
                                F11 = F11;
                            }
                            qVar11 = qVar11.f19344w;
                            eVar5 = eVar5;
                            F11 = F11;
                        }
                        if (i16 == 1) {
                            eVar5 = eVar5;
                            F11 = F11;
                        } else {
                            eVar5 = eVar5;
                            F11 = F11;
                        }
                    }
                    F11 = AbstractC0283f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        if (((d) arrayList.get(i17)).F(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v12, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r6v18, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Boolean d(int i10, p171r0.e eVar, p241y9.c cVar) {
        Boolean bool;
        boolean zA;
        Object obj;
        C0280d0 c0280d0;
        ?? r10;
        t tVar = this.f21205f;
        t tVarG = f.g(tVar);
        int i11 = 4;
        C0364q c0364q = this.f21204e;
        if (tVarG != null) {
            m mVar = (m) c0364q.get();
            bool = null;
            n nVarW0 = tVarG.w0();
            p pVar = nVarW0.f21220h;
            p pVar2 = nVarW0.f21221i;
            if (i10 == 1) {
                pVar = nVarW0.f21215b;
            } else if (i10 == 2) {
                pVar = nVarW0.f21216c;
            } else if (i10 == 5) {
                pVar = nVarW0.f21217d;
            } else if (i10 == 6) {
                pVar = nVarW0.f21218e;
            } else if (i10 == 3) {
                int iOrdinal = mVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new A6.a();
                    }
                    pVar = pVar2;
                }
                if (pVar == p.f21223b) {
                    pVar = null;
                }
                if (pVar == null) {
                    pVar = nVarW0.f21219f;
                }
            } else if (i10 == 4) {
                int iOrdinal2 = mVar.ordinal();
                if (iOrdinal2 == 0) {
                    pVar = pVar2;
                } else if (iOrdinal2 != 1) {
                    throw new A6.a();
                }
                if (pVar == p.f21223b) {
                    pVar = null;
                }
                if (pVar == null) {
                    pVar = nVarW0.g;
                }
            } else {
                if (i10 != 7 && i10 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                a aVar = new a(i10);
                f.o(tVarG);
                k kVar = (k) AbstractC0283f.y(tVarG).getFocusOwner();
                t tVar2 = kVar.f21209l;
                if (i10 == 7) {
                    nVarW0.j.e(aVar);
                } else {
                    nVarW0.f21222k.e(aVar);
                }
                if (aVar.f21184b) {
                    pVar = p.f21224c;
                } else {
                    pVar = tVar2 != kVar.f21209l ? p.f21225d : p.f21223b;
                }
            }
            if (!p251z9.j.a(pVar, p.f21224c)) {
                if (p251z9.j.a(pVar, p.f21225d)) {
                    t tVarG2 = f.g(tVar);
                    if (tVarG2 != null) {
                        return (Boolean) cVar.e(tVarG2);
                    }
                } else if (!p251z9.j.a(pVar, p.f21223b)) {
                    return Boolean.valueOf(pVar.a(cVar));
                }
            }
            return bool;
        }
        bool = null;
        tVarG = null;
        m mVar2 = (m) c0364q.get();
        C0023i c0023i = new C0023i(tVarG, this, cVar);
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                zA = f.k(tVar, c0023i);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = f.a(tVar, c0023i);
            }
            return Boolean.valueOf(zA);
        }
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return f.F(i10, c0023i, tVar, eVar);
        }
        if (i10 == 7) {
            int iOrdinal3 = mVar2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new A6.a();
                }
                i11 = 3;
            }
            t tVarG3 = f.g(tVar);
            if (tVarG3 != null) {
                return f.F(i11, c0023i, tVarG3, eVar);
            }
            return bool;
        }
        if (i10 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.a(i10))).toString());
        }
        t tVarG4 = f.g(tVar);
        boolean zBooleanValue = false;
        if (tVarG4 != null) {
            if (!tVarG4.f19339r.f19338E) {
                a.b("visitAncestors called on an unattached node");
            }
            Object obj2 = tVarG4.f19339r.f19343v;
            I iX = AbstractC0283f.x(tVarG4);
            loop0: while (true) {
                if (iX == null) {
                    obj = bool;
                    break;
                }
                if ((((q) iX.f3914W.f4067f).f19342u & 1024) != 0) {
                    while (r10 != 0) {
                        if ((r10.f19341t & 1024) != 0) {
                            ?? F10 = r10;
                            ?? eVar2 = bool;
                            while (F10 != 0) {
                                if (F10 instanceof t) {
                                    t tVar3 = (t) F10;
                                    if (tVar3.w0().f21214a) {
                                        obj = tVar3;
                                        break loop0;
                                    }
                                } else if ((F10.f19341t & 1024) != 0 && (F10 instanceof AbstractC0291n)) {
                                    q qVar = ((AbstractC0291n) F10).f4151G;
                                    int i12 = 0;
                                    while (qVar != null) {
                                        if ((qVar.f19341t & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                F10 = F10;
                                                eVar2 = eVar2;
                                                eVar2 = eVar2;
                                                F10 = qVar;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new e(new q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar2.b(F10);
                                                    F10 = bool;
                                                }
                                                eVar2.b(qVar);
                                            }
                                        } else {
                                            F10 = F10;
                                            eVar2 = eVar2;
                                        }
                                        qVar = qVar.f19344w;
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                    if (i12 == 1) {
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    } else {
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar2);
                            }
                        }
                        r10 = r10.f19343v;
                    }
                }
                r10 = obj2;
                iX = iX.u();
                obj2 = (iX == null || (c0280d0 = iX.f3914W) == null) ? bool : (z0) c0280d0.f4066e;
            }
        } else {
            obj = bool;
            break;
        }
        if (obj != null && !obj.equals(tVar)) {
            zBooleanValue = ((Boolean) c0023i.e(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean e(int i10) {
        v vVar = new v();
        vVar.f24886r = Boolean.FALSE;
        this.f21206h.getClass();
        t tVar = this.f21209l;
        Boolean boolD = d(i10, (p171r0.e) this.f21203d.invoke(), new p093j0.q(vVar, i10));
        Boolean bool = Boolean.TRUE;
        if (!p251z9.j.a(boolD, bool) || tVar == this.f21209l) {
            if (boolD != null && vVar.f24886r != null) {
                if (!boolD.equals(bool) || !p251z9.j.a(vVar.f24886r, bool)) {
                    if (i10 != 1 && i10 != 2) {
                        if (((Boolean) this.f21201b.e(new d(i10))).booleanValue()) {
                        }
                    } else if (b(i10, false, false)) {
                        Boolean boolD2 = d(i10, null, new F.v(i10, 4));
                        if (boolD2 != null ? boolD2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f(t tVar) {
        I iX;
        R0.j jVarW;
        I iX2;
        R0.j jVarW2;
        t tVar2 = this.f21209l;
        this.f21209l = tVar;
        A a9 = this.f21208k;
        Object[] objArr = a9.f22650a;
        int i10 = a9.f22651b;
        for (int i11 = 0; i11 < i10; i11++) {
            p122m0.d dVar = (p122m0.d) ((h) objArr[i11]);
            dVar.getClass();
            if (tVar2 != null && (iX2 = AbstractC0283f.x(tVar2)) != null && (jVarW2 = iX2.w()) != null && jVarW2.f7108r.b(i.g)) {
                dVar.f19462a.f(dVar.f19464c, iX2.f3926s);
            }
            if (tVar != null && (iX = AbstractC0283f.x(tVar)) != null && (jVarW = iX.w()) != null && jVarW.f7108r.b(i.g)) {
                int i12 = iX.f3926s;
                dVar.f19465d.f7456a.n(i12, new b(dVar, i12));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0211  */
    /* JADX WARN: Code duplicated, block: B:49:0x0232  */
    /* JADX WARN: Code duplicated, block: B:51:0x0241  */
    /* JADX WARN: Code duplicated, block: B:52:0x027b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int i10;
        long j;
        long j10;
        int iNumberOfTrailingZeros2;
        int i11;
        int i12;
        long[] jArr;
        long[] jArr2;
        int i13;
        long[] jArr3;
        long[] jArr4;
        int i14;
        int i15;
        long[] jArr5;
        boolean z10;
        long jH = B0.c.H(keyEvent);
        int iO = B0.c.O(keyEvent);
        int i16 = -862048943;
        char c10 = ' ';
        int i17 = 8;
        int i18 = 0;
        int i19 = 1;
        if (iO != 2) {
            if (iO != 1) {
                return true;
            }
            x xVar = this.j;
            if (xVar == null || !xVar.a(jH)) {
                return false;
            }
            x xVar2 = this.j;
            if (xVar2 != null) {
                int i20 = ((int) ((jH >>> 32) ^ jH)) * (-862048943);
                int i21 = i20 ^ (i20 << 16);
                int i22 = i21 & 127;
                int i23 = xVar2.f22775c;
                int i24 = i21 >>> 7;
                loop5: while (true) {
                    int i25 = i24 & i23;
                    long[] jArr6 = xVar2.f22773a;
                    int i26 = i25 >> 3;
                    int i27 = (i25 & 7) << 3;
                    long j11 = ((jArr6[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr6[i26] >>> i27);
                    long j12 = (((long) i22) * 72340172838076673L) ^ j11;
                    for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i25) & i23;
                        if (xVar2.f22774b[iNumberOfTrailingZeros] == jH) {
                            break loop5;
                        }
                    }
                    if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i18 += 8;
                    i24 = i25 + i18;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    xVar2.f22776d--;
                    long[] jArr7 = xVar2.f22773a;
                    int i28 = xVar2.f22775c;
                    int i29 = iNumberOfTrailingZeros >> 3;
                    int i30 = (iNumberOfTrailingZeros & 7) << 3;
                    long j14 = (jArr7[i29] & (~(255 << i30))) | (254 << i30);
                    jArr7[i29] = j14;
                    jArr7[(((iNumberOfTrailingZeros - 7) & i28) + (i28 & 7)) >> 3] = j14;
                    return true;
                }
            }
            return true;
        }
        x xVar3 = this.j;
        if (xVar3 == null) {
            xVar3 = new x(3);
            this.j = xVar3;
        }
        x xVar4 = xVar3;
        int i31 = ((int) (jH ^ (jH >>> 32))) * (-862048943);
        int i32 = i31 ^ (i31 << 16);
        int i33 = i32 >>> 7;
        int i34 = i32 & 127;
        int i35 = xVar4.f22775c;
        int i36 = i33 & i35;
        int i37 = 0;
        loop0: while (true) {
            long[] jArr8 = xVar4.f22773a;
            int i38 = i36 >> 3;
            int i39 = i16;
            int i40 = (i36 & 7) << 3;
            long j15 = jArr8[i38] >>> i40;
            long j16 = jArr8[i38 + 1] << (64 - i40);
            char c11 = c10;
            long j17 = j15 | (j16 & ((-i40) >> 63));
            long j18 = i34;
            long j19 = j17 ^ (j18 * 72340172838076673L);
            long j20 = (j19 - 72340172838076673L) & (~j19) & (-9187201950435737472L);
            while (j20 != 0) {
                iNumberOfTrailingZeros2 = (i36 + (Long.numberOfTrailingZeros(j20) >> 3)) & i35;
                char c12 = c11;
                if (xVar4.f22774b[iNumberOfTrailingZeros2] == jH) {
                    z10 = 1;
                    break loop0;
                }
                j20 &= j20 - 1;
                c11 = c12;
            }
            char c13 = c11;
            if ((j17 & ((~j17) << 6) & (-9187201950435737472L)) != 0) {
                int iB = xVar4.b(i33);
                if (xVar4.f22777e != 0 || ((xVar4.f22773a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    i10 = 1;
                    j = j18;
                    j10 = 128;
                } else {
                    int i41 = xVar4.f22775c;
                    if (i41 > i17) {
                        int i42 = i17;
                        if (Long.compare((((long) xVar4.f22776d) * 32) ^ Long.MIN_VALUE, (((long) i41) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr9 = xVar4.f22773a;
                            int i43 = xVar4.f22775c;
                            long[] jArr10 = xVar4.f22774b;
                            int i44 = (i43 + 7) >> 3;
                            int i45 = 0;
                            while (i45 < i44) {
                                long j21 = jArr9[i45] & (-9187201950435737472L);
                                jArr9[i45] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i45++;
                                i42 = i42;
                                j18 = j18;
                            }
                            j = j18;
                            j10 = 128;
                            int i46 = i42;
                            int iJ0 = l.j0(jArr9);
                            int i47 = iJ0 - 1;
                            long j22 = 72057594037927935L;
                            jArr9[i47] = (jArr9[i47] & 72057594037927935L) | (-72057594037927936L);
                            jArr9[iJ0] = jArr9[0];
                            int i48 = 0;
                            while (i48 != i43) {
                                int i49 = i48 >> 3;
                                int i50 = (i48 & 7) << 3;
                                long j23 = (jArr9[i49] >> i50) & 255;
                                if (j23 != 128 && j23 == 254) {
                                    long j24 = jArr10[i48];
                                    int i51 = ((int) (j24 ^ (j24 >>> c13))) * i39;
                                    int i52 = i51 ^ (i51 << 16);
                                    int i53 = i52 >>> 7;
                                    int iB2 = xVar4.b(i53);
                                    int i54 = i53 & i43;
                                    int i55 = i46;
                                    if (((iB2 - i54) & i43) / 8 == ((i48 - i54) & i43) / 8) {
                                        long j25 = j22;
                                        jArr9[i49] = (((long) (i52 & 127)) << i50) | (jArr9[i49] & (~(255 << i50)));
                                        jArr9[jArr9.length - i19] = (jArr9[0] & j25) | Long.MIN_VALUE;
                                        i48++;
                                        i46 = i55;
                                        j22 = j25;
                                    } else {
                                        long j26 = j22;
                                        int i56 = iB2 >> 3;
                                        long j27 = jArr9[i56];
                                        int i57 = (iB2 & 7) << 3;
                                        if (((j27 >> i57) & 255) == 128) {
                                            jArr5 = jArr10;
                                            jArr9[i56] = ((~(255 << i57)) & j27) | (((long) (i52 & 127)) << i57);
                                            jArr9[i49] = (jArr9[i49] & (~(255 << i50))) | (128 << i50);
                                            jArr5[iB2] = jArr5[i48];
                                            jArr5[i48] = 0;
                                        } else {
                                            jArr5 = jArr10;
                                            jArr9[i56] = (((long) (i52 & 127)) << i57) | ((~(255 << i57)) & j27);
                                            long j28 = jArr5[iB2];
                                            jArr5[iB2] = jArr5[i48];
                                            jArr5[i48] = j28;
                                            i48--;
                                        }
                                        jArr9[jArr9.length - 1] = (jArr9[0] & j26) | Long.MIN_VALUE;
                                        i48++;
                                        jArr10 = jArr5;
                                        i43 = i43;
                                        i46 = i55;
                                        j22 = j26;
                                        i19 = i19;
                                        i33 = i33;
                                    }
                                } else {
                                    i48++;
                                }
                            }
                            i11 = i19;
                            i12 = i33;
                            xVar4.f22777e = M.a(xVar4.f22775c) - xVar4.f22776d;
                        } else {
                            i11 = 1;
                            i12 = i33;
                            j = j18;
                            j10 = 128;
                            int iC = M.c(xVar4.f22775c);
                            jArr = xVar4.f22773a;
                            jArr2 = xVar4.f22774b;
                            i13 = xVar4.f22775c;
                            xVar4.c(iC);
                            jArr3 = xVar4.f22773a;
                            jArr4 = xVar4.f22774b;
                            i14 = xVar4.f22775c;
                            i15 = 0;
                            while (i15 < i13) {
                                if (((jArr[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                                    long j29 = jArr2[i15];
                                    int i58 = ((int) ((j29 >>> c13) ^ j29)) * i39;
                                    int i59 = i58 ^ (i58 << 16);
                                    int iB3 = xVar4.b(i59 >>> 7);
                                    long j30 = i59 & 127;
                                    int i60 = iB3 >> 3;
                                    int i61 = (iB3 & 7) << 3;
                                    long j31 = (jArr3[i60] & (~(255 << i61))) | (j30 << i61);
                                    jArr3[i60] = j31;
                                    jArr3[(((iB3 - 7) & i14) + (i14 & 7)) >> 3] = j31;
                                    jArr4[iB3] = j29;
                                }
                                i15++;
                                jArr = jArr;
                                jArr2 = jArr2;
                            }
                        }
                    } else {
                        i11 = 1;
                        i12 = i33;
                        j = j18;
                        j10 = 128;
                        int iC2 = M.c(xVar4.f22775c);
                        jArr = xVar4.f22773a;
                        jArr2 = xVar4.f22774b;
                        i13 = xVar4.f22775c;
                        xVar4.c(iC2);
                        jArr3 = xVar4.f22773a;
                        jArr4 = xVar4.f22774b;
                        i14 = xVar4.f22775c;
                        i15 = 0;
                        while (i15 < i13) {
                            if (((jArr[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                                long j210 = jArr2[i15];
                                int i510 = ((int) ((j210 >>> c13) ^ j210)) * i39;
                                int i511 = i510 ^ (i510 << 16);
                                int iB4 = xVar4.b(i511 >>> 7);
                                long j32 = i511 & 127;
                                int i62 = iB4 >> 3;
                                int i63 = (iB4 & 7) << 3;
                                long j33 = (jArr3[i62] & (~(255 << i63))) | (j32 << i63);
                                jArr3[i62] = j33;
                                jArr3[(((iB4 - 7) & i14) + (i14 & 7)) >> 3] = j33;
                                jArr4[iB4] = j210;
                            }
                            i15++;
                            jArr = jArr;
                            jArr2 = jArr2;
                        }
                    }
                    iB = xVar4.b(i12);
                    i10 = i11;
                }
                iNumberOfTrailingZeros2 = iB;
                xVar4.f22776d++;
                int i64 = xVar4.f22777e;
                long[] jArr11 = xVar4.f22773a;
                int i65 = iNumberOfTrailingZeros2 >> 3;
                long j34 = jArr11[i65];
                int i66 = (iNumberOfTrailingZeros2 & 7) << 3;
                xVar4.f22777e = i64 - (((j34 >> i66) & 255) == j10 ? i10 == true ? 1 : 0 : 0);
                int i67 = xVar4.f22775c;
                long j35 = (j34 & (~(255 << i66))) | (j << i66);
                jArr11[i65] = j35;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i67) + (i67 & 7)) >> 3] = j35;
                z10 = i10;
                break;
            }
            i37 += 8;
            i36 = (i36 + i37) & i35;
            i17 = i17;
            c10 = c13;
            i16 = i39;
        }
        xVar4.f22774b[iNumberOfTrailingZeros2] = jH;
        return z10;
    }
}
