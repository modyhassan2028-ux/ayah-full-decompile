package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0800d implements Iterable, InterfaceC0850n, InterfaceC0830j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TreeMap f14221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TreeMap f14222s;

    public C0800d() {
        this.f14221r = new TreeMap();
        this.f14222s = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        TreeMap treeMap = this.f14221r;
        if (treeMap.size() == 1) {
            return p(0).b();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final InterfaceC0850n c(String str) {
        InterfaceC0850n interfaceC0850n;
        if ("length".equals(str)) {
            return new C0815g(Double.valueOf(o()));
        }
        return (!e(str) || (interfaceC0850n = (InterfaceC0850n) this.f14222s.get(str)) == null) ? InterfaceC0850n.f14367i : interfaceC0850n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final boolean e(String str) {
        return "length".equals(str) || this.f14222s.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0800d)) {
            return false;
        }
        C0800d c0800d = (C0800d) obj;
        if (o() != c0800d.o()) {
            return false;
        }
        TreeMap treeMap = this.f14221r;
        if (treeMap.isEmpty()) {
            return c0800d.f14221r.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!p(iIntValue).equals(c0800d.p(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return new C0795c(this, this.f14221r.keySet().iterator(), this.f14222s.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0209  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:111:0x024f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x0276  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285 A[LOOP:2: B:116:0x0280->B:118:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0294  */
    /* JADX WARN: Code duplicated, block: B:122:0x029a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0302  */
    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0323  */
    /* JADX WARN: Code duplicated, block: B:152:0x0340 A[LOOP:3: B:151:0x033e->B:152:0x0340, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0350  */
    /* JADX WARN: Code duplicated, block: B:156:0x0358  */
    /* JADX WARN: Code duplicated, block: B:158:0x036f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0376  */
    /* JADX WARN: Code duplicated, block: B:164:0x0382  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e0 A[LOOP:5: B:179:0x03de->B:180:0x03e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x0407  */
    /* JADX WARN: Code duplicated, block: B:185:0x040f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0419  */
    /* JADX WARN: Code duplicated, block: B:189:0x041c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0422  */
    /* JADX WARN: Code duplicated, block: B:197:0x043f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0442  */
    /* JADX WARN: Code duplicated, block: B:201:0x044e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0456  */
    /* JADX WARN: Code duplicated, block: B:206:0x0462  */
    /* JADX WARN: Code duplicated, block: B:208:0x046c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0476  */
    /* JADX WARN: Code duplicated, block: B:212:0x048d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0493  */
    /* JADX WARN: Code duplicated, block: B:216:0x0499  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:226:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:228:0x04d4 A[LOOP:6: B:225:0x04be->B:228:0x04d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x04f2 A[LOOP:7: B:232:0x04ec->B:234:0x04f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x0516 A[LOOP:8: B:236:0x0510->B:238:0x0516, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x053b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0543  */
    /* JADX WARN: Code duplicated, block: B:245:0x054d  */
    /* JADX WARN: Code duplicated, block: B:248:0x056b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0587  */
    /* JADX WARN: Code duplicated, block: B:252:0x0591  */
    /* JADX WARN: Code duplicated, block: B:255:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:256:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:259:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:261:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:263:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:272:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:274:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:276:0x0607  */
    /* JADX WARN: Code duplicated, block: B:279:0x060e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0614  */
    /* JADX WARN: Code duplicated, block: B:283:0x061a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0622  */
    /* JADX WARN: Code duplicated, block: B:287:0x0628  */
    /* JADX WARN: Code duplicated, block: B:289:0x062e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0650  */
    /* JADX WARN: Code duplicated, block: B:292:0x065c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0662  */
    /* JADX WARN: Code duplicated, block: B:297:0x0676  */
    /* JADX WARN: Code duplicated, block: B:299:0x0694  */
    /* JADX WARN: Code duplicated, block: B:302:0x069d A[LOOP:10: B:300:0x0695->B:302:0x069d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x06b5 A[LOOP:11: B:305:0x06b5->B:321:0x0707, LOOP_START, PHI: r6 r32
      0x06b5: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:304:0x06b3, B:321:0x0707] A[DONT_GENERATE, DONT_INLINE]
      0x06b5: PHI (r32v1 java.util.TreeMap) = (r32v0 java.util.TreeMap), (r32v4 java.util.TreeMap) binds: [B:304:0x06b3, B:321:0x0707] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:309:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:311:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:313:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:314:0x06db  */
    /* JADX WARN: Code duplicated, block: B:316:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:318:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:326:0x0735 A[ADDED_TO_REGION, LOOP:13: B:326:0x0735->B:327:0x0737, LOOP_START, PHI: r0
      0x0735: PHI (r0v34 int) = (r0v33 int), (r0v35 int) binds: [B:296:0x0674, B:327:0x0737] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:327:0x0737 A[LOOP:13: B:326:0x0735->B:327:0x0737, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x0749  */
    /* JADX WARN: Code duplicated, block: B:331:0x0751  */
    /* JADX WARN: Code duplicated, block: B:333:0x0757  */
    /* JADX WARN: Code duplicated, block: B:335:0x0764  */
    /* JADX WARN: Code duplicated, block: B:337:0x077a  */
    /* JADX WARN: Code duplicated, block: B:339:0x0780  */
    /* JADX WARN: Code duplicated, block: B:341:0x0786  */
    /* JADX WARN: Code duplicated, block: B:344:0x07a3 A[LOOP:14: B:342:0x079d->B:344:0x07a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:348:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:350:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:352:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:354:0x07db  */
    /* JADX WARN: Code duplicated, block: B:356:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:361:0x0803 A[LOOP:16: B:359:0x07fd->B:361:0x0803, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x0827  */
    /* JADX WARN: Code duplicated, block: B:368:0x082f  */
    /* JADX WARN: Code duplicated, block: B:370:0x083f  */
    /* JADX WARN: Code duplicated, block: B:380:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x072d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x070c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x081e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x081a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x07f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0203  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (com.google.android.gms.internal.measurement.AbstractC0813f2.Z(r7, r2, (com.google.android.gms.internal.measurement.C0845m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).o() != r7.o()) goto L170;
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0850n g(java.lang.String r38, Aa.a r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instruction units count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0800d.g(java.lang.String, Aa.a, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        return t(",");
    }

    public final int hashCode() {
        return this.f14221r.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0860p(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0830j
    public final void j(String str, InterfaceC0850n interfaceC0850n) {
        TreeMap treeMap = this.f14222s;
        if (interfaceC0850n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0850n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        C0800d c0800d = new C0800d();
        for (Map.Entry entry : this.f14221r.entrySet()) {
            boolean z10 = entry.getValue() instanceof InterfaceC0830j;
            TreeMap treeMap = c0800d.f14221r;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC0850n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC0850n) entry.getValue()).l());
            }
        }
        return c0800d;
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(o());
        for (int i10 = 0; i10 < o(); i10++) {
            arrayList.add(p(i10));
        }
        return arrayList;
    }

    public final Iterator n() {
        return this.f14221r.keySet().iterator();
    }

    public final int o() {
        TreeMap treeMap = this.f14221r;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final InterfaceC0850n p(int i10) {
        InterfaceC0850n interfaceC0850n;
        if (i10 < o()) {
            return (!r(i10) || (interfaceC0850n = (InterfaceC0850n) this.f14221r.get(Integer.valueOf(i10))) == null) ? InterfaceC0850n.f14367i : interfaceC0850n;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void q(int i10, InterfaceC0850n interfaceC0850n) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.f14221r;
        if (interfaceC0850n == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), interfaceC0850n);
        }
    }

    public final boolean r(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f14221r;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i10);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void s(int i10) {
        TreeMap treeMap = this.f14221r;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (treeMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            treeMap.put(numValueOf, InterfaceC0850n.f14367i);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC0850n interfaceC0850n = (InterfaceC0850n) treeMap.get(numValueOf2);
            if (interfaceC0850n != null) {
                treeMap.put(Integer.valueOf(i10 - 1), interfaceC0850n);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f14221r.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= o()) {
                    break;
                }
                InterfaceC0850n interfaceC0850nP = p(i10);
                sb.append(str2);
                if (!(interfaceC0850nP instanceof r) && !(interfaceC0850nP instanceof C0840l)) {
                    sb.append(interfaceC0850nP.h());
                }
                i10++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public C0800d(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                q(i10, (InterfaceC0850n) list.get(i10));
            }
        }
    }
}
