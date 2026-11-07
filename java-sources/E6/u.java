package E6;

import Da.A;
import K0.C0368s0;
import N9.S;
import N9.k0;
import U0.AbstractC0517i;
import U0.C0513e;
import U0.C0514f;
import U0.C0515g;
import U0.C0516h;
import U0.L;
import Z0.B;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media.MediaBrowserServiceCompat;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class u implements U0.t, p100j8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1964f;

    public u() {
        this.f1959a = 7;
        this.f1959a = 7;
        this.f1960b = new AtomicBoolean(false);
        this.f1962d = new CountDownLatch(1);
        this.f1961c = "PublicSuffixDatabase.list";
    }

    public void A(int i10) {
        ((Paint) this.f1962d).setColor(i10);
        ((ViewGroup) this.f1961c).invalidate();
    }

    public Set B(Class cls) {
        return g(p100j8.p.a(cls));
    }

    public void C(p249z7.d dVar) {
        ViewGroup viewGroup = (ViewGroup) this.f1961c;
        if (dVar == null) {
            this.f1963e = null;
        } else {
            p249z7.d dVar2 = (p249z7.d) this.f1963e;
            if (dVar2 == null) {
                this.f1963e = new p249z7.d(dVar);
            } else {
                float f3 = dVar.f24852a;
                float f7 = dVar.f24853b;
                float f10 = dVar.f24854c;
                dVar2.f24852a = f3;
                dVar2.f24853b = f7;
                dVar2.f24854c = f10;
            }
            if (dVar.f24854c + 1.0E-4f >= p000a.a.B(dVar.f24852a, dVar.f24853b, viewGroup.getWidth(), viewGroup.getHeight())) {
                ((p249z7.d) this.f1963e).f24854c = Float.MAX_VALUE;
            }
        }
        viewGroup.invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    @Override // U0.t
    public float a() {
        return ((Number) this.f1962d.getValue()).floatValue();
    }

    @Override // p100j8.b
    public Object b(Class cls) {
        if (!((Set) this.f1960b).contains(p100j8.p.a(cls))) {
            throw new A6.a("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objB = ((p100j8.b) this.f1964f).b(cls);
        if (!cls.equals(G8.a.class)) {
            return objB;
        }
        return new p100j8.q();
    }

    @Override // U0.t
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.f1964f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((U0.s) arrayList.get(i10)).f8121a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p100j8.b
    public p100j8.n d(p100j8.p pVar) {
        if (((Set) this.f1962d).contains(pVar)) {
            return ((p100j8.b) this.f1964f).d(pVar);
        }
        throw new A6.a("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    @Override // p100j8.b
    public Object e(p100j8.p pVar) {
        if (((Set) this.f1960b).contains(pVar)) {
            return ((p100j8.b) this.f1964f).e(pVar);
        }
        throw new A6.a("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // p100j8.b
    public I8.b f(Class cls) {
        return i(p100j8.p.a(cls));
    }

    @Override // p100j8.b
    public Set g(p100j8.p pVar) {
        if (((Set) this.f1963e).contains(pVar)) {
            return ((p100j8.b) this.f1964f).g(pVar);
        }
        throw new A6.a("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    @Override // U0.t
    public float h() {
        return ((Number) this.f1963e.getValue()).floatValue();
    }

    @Override // p100j8.b
    public I8.b i(p100j8.p pVar) {
        if (((Set) this.f1961c).contains(pVar)) {
            return ((p100j8.b) this.f1964f).i(pVar);
        }
        throw new A6.a("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi j(int i10) {
        Bidi bidi;
        Layout layout = (Layout) this.f1960b;
        ArrayList arrayList = (ArrayList) this.f1961c;
        ArrayList arrayList2 = (ArrayList) this.f1962d;
        boolean[] zArr = (boolean[]) this.f1963e;
        if (zArr[i10]) {
            return (Bidi) arrayList2.get(i10);
        }
        int iIntValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i10)).intValue();
        int i11 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f1964f;
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i11)) {
            bidi = new Bidi(cArr2, 0, null, 0, i11, layout.getParagraphDirection(layout.getLineForOffset(p(i10))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i10, bidi);
        zArr[i10] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f1964f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f1964f = cArr2;
        return bidi;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup, z7.e] */
    public void k(Canvas canvas) {
        Canvas canvas2;
        Paint paint = (Paint) this.f1962d;
        ?? r10 = (ViewGroup) this.f1960b;
        ViewGroup viewGroup = (ViewGroup) this.f1961c;
        p249z7.d dVar = (p249z7.d) this.f1963e;
        if (dVar == null || dVar.f24854c == Float.MAX_VALUE) {
            r10.d(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                float width = viewGroup.getWidth();
                float height = viewGroup.getHeight();
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width, height, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            r10.d(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                float width2 = viewGroup.getWidth();
                float height2 = viewGroup.getHeight();
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width2, height2, paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = (Drawable) this.f1964f;
        if (drawable == null || ((p249z7.d) this.f1963e) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float fWidth = ((p249z7.d) this.f1963e).f24852a - (bounds.width() / 2.0f);
        float fHeight = ((p249z7.d) this.f1963e).f24853b - (bounds.height() / 2.0f);
        canvas2.translate(fWidth, fHeight);
        ((Drawable) this.f1964f).draw(canvas2);
        canvas2.translate(-fWidth, -fHeight);
    }

    public p100j8.n l(Class cls) {
        return d(p100j8.p.a(cls));
    }

    public float m(int i10, boolean z10) {
        Layout layout = (Layout) this.f1960b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    public float n(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iS = i10;
        Layout layout = (Layout) this.f1960b;
        if (!z11) {
            return m(i10, z10);
        }
        int iD = V0.o.d(layout, iS, z11);
        int lineStart = layout.getLineStart(iD);
        int lineEnd = layout.getLineEnd(iD);
        if (iS != lineStart && iS != lineEnd) {
            return m(i10, z10);
        }
        if (iS == 0 || iS == layout.getText().length()) {
            return m(i10, z10);
        }
        int iO = o(iS, z11);
        boolean z12 = layout.getParagraphDirection(layout.getLineForOffset(p(iO))) == -1;
        int iS2 = s(lineEnd, lineStart);
        int iP = p(iO);
        int i13 = lineStart - iP;
        int i14 = iS2 - iP;
        Bidi bidiJ = j(iO);
        Bidi bidiCreateLineBidi = bidiJ != null ? bidiJ.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == zIsRtlCharAt) {
                z12 = !z12;
            }
            return iS == lineStart ? z12 : !z12 ? layout.getLineLeft(iD) : layout.getLineRight(iD);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        V0.k[] kVarArr = new V0.k[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            kVarArr[i15] = new V0.k(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, kVarArr, 0, runCount);
        if (iS == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (kVarArr[i17].f8371a == iS) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z13 = (z10 || z12 == kVarArr[i12].f8373c) ? !z12 : z12;
            if (i12 == 0 && z13) {
                return layout.getLineLeft(iD);
            }
            if (i12 != runCount - 1 || z13) {
                return z13 ? layout.getPrimaryHorizontal(kVarArr[i12 - 1].f8371a) : layout.getPrimaryHorizontal(kVarArr[i12 + 1].f8371a);
            }
            return layout.getLineRight(iD);
        }
        if (iS > iS2) {
            iS = s(iS, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (kVarArr[i18].f8372b == iS) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z14 = (z10 || z12 == kVarArr[i11].f8373c) ? z12 : !z12;
        if (i11 == 0 && z14) {
            return layout.getLineLeft(iD);
        }
        if (i11 != runCount - 1 || z14) {
            return z14 ? layout.getPrimaryHorizontal(kVarArr[i11 - 1].f8372b) : layout.getPrimaryHorizontal(kVarArr[i11 + 1].f8372b);
        }
        return layout.getLineRight(iD);
    }

    public int o(int i10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.f1961c;
        int iN = AbstractC0813f2.n(arrayList, Integer.valueOf(i10));
        int i11 = iN < 0 ? -(iN + 1) : iN + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public int p(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f1961c).get(i10 - 1)).intValue();
    }

    public p249z7.d q() {
        p249z7.d dVar = (p249z7.d) this.f1963e;
        if (dVar == null) {
            return null;
        }
        p249z7.d dVar2 = new p249z7.d(dVar);
        if (dVar2.f24854c == Float.MAX_VALUE) {
            float f3 = dVar2.f24852a;
            float f7 = dVar2.f24853b;
            ViewGroup viewGroup = (ViewGroup) this.f1961c;
            dVar2.f24854c = p000a.a.B(f3, f7, viewGroup.getWidth(), viewGroup.getHeight());
        }
        return dVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, z7.e] */
    public boolean r() {
        if (((ViewGroup) this.f1960b).h()) {
            p249z7.d dVar = (p249z7.d) this.f1963e;
            if (dVar == null || dVar.f24854c == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public int s(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.f1960b).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((p251z9.j.f(cCharAt, 8192) < 0 || p251z9.j.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    public Da.d t() throws IOException {
        AssetManager assets;
        ua.e eVar = ua.e.f22996a;
        Object obj = ua.e.f22996a;
        ua.d dVar = obj != null ? (ua.d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        if (contextB == null || (assets = contextB.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open((String) this.f1961c);
        p251z9.j.d(inputStreamOpen, "open(...)");
        return new Da.d(1, inputStreamOpen, new A());
    }

    public String toString() {
        switch (this.f1959a) {
            case 5:
                Map map = (Map) this.f1963e;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f1961c);
                sb.append(", url=");
                sb.append((ka.n) this.f1960b);
                ka.l lVar = (ka.l) this.f1962d;
                if (lVar.size() != 0) {
                    sb.append(", headers=[");
                    int i10 = 0;
                    for (Object obj : lVar) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC0813f2.T();
                            throw null;
                        }
                        p110k9.j jVar = (p110k9.j) obj;
                        String str = (String) jVar.f19077r;
                        String str2 = (String) jVar.f19078s;
                        if (i10 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (la.c.i(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i10 = i11;
                    }
                    sb.append(']');
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Aa.a u() {
        Aa.a aVar = new Aa.a();
        Object objL0 = p120l9.s.f19441r;
        aVar.f557u = objL0;
        aVar.f554r = (ka.n) this.f1960b;
        aVar.f555s = (String) this.f1961c;
        Map map = (Map) this.f1963e;
        if (!map.isEmpty()) {
            objL0 = p120l9.w.l0(map);
        }
        aVar.f557u = objL0;
        aVar.f556t = ((ka.l) this.f1962d).d();
        return aVar;
    }

    public void v() {
        p143o2.g gVar = new p143o2.g(this, (MediaBrowserServiceCompat) this.f1964f);
        this.f1961c = gVar;
        gVar.onCreate();
    }

    public void w() {
        try {
            Da.t tVarP = Y2.a.p(t());
            try {
                Da.k kVarK = tVarP.k(tVarP.readInt());
                Da.k kVarK2 = tVarP.k(tVarP.readInt());
                tVarP.close();
                synchronized (this) {
                    p251z9.j.b(kVarK);
                    this.f1963e = kVarK;
                    p251z9.j.b(kVarK2);
                    this.f1964f = kVarK2;
                }
                ((CountDownLatch) this.f1962d).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p181s2.o.e(tVarP, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.f1962d).countDown();
            throw th3;
        }
    }

    public void x(B6.a aVar, B6.f fVar) {
        v vVar = (v) this.f1964f;
        j jVar = (j) this.f1960b;
        String str = (String) this.f1961c;
        B6.d dVar = (B6.d) this.f1963e;
        if (dVar == null) {
            throw new NullPointerException("Null transformer");
        }
        B6.b bVar = (B6.b) this.f1962d;
        J6.e eVar = vVar.f1968c;
        j jVarB = jVar.b(aVar.f642b);
        h hVar = new h();
        hVar.f1927h = new HashMap();
        hVar.f1926f = Long.valueOf(vVar.f1966a.e());
        hVar.g = Long.valueOf(vVar.f1967b.e());
        hVar.f1921a = str;
        hVar.f1925e = new n(bVar, (byte[]) dVar.apply(aVar.f641a));
        hVar.f1923c = null;
        J6.c cVar = (J6.c) eVar;
        cVar.f4357b.execute(new J6.a(cVar, jVarB, fVar, hVar.b(), 0));
    }

    public void y(String str, Object obj) {
        p251z9.j.e(str, "key");
        ((LinkedHashMap) this.f1960b).put(str, obj);
        S s10 = (S) ((LinkedHashMap) this.f1962d).get(str);
        if (s10 != null) {
            ((k0) s10).m(obj);
        }
        S s11 = (S) ((LinkedHashMap) this.f1963e).get(str);
        if (s11 != null) {
            ((k0) s11).m(obj);
        }
    }

    public void z(Drawable drawable) {
        this.f1964f = drawable;
        ((ViewGroup) this.f1961c).invalidate();
    }

    public u(Map map) {
        this.f1959a = 3;
        p251z9.j.e(map, "initialState");
        this.f1960b = p120l9.w.l0(map);
        this.f1961c = new LinkedHashMap();
        this.f1962d = new LinkedHashMap();
        this.f1963e = new LinkedHashMap();
        this.f1964f = new C0368s0(4, this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public u(Aa.a aVar) {
        this.f1959a = 5;
        ka.n nVar = (ka.n) aVar.f554r;
        if (nVar != null) {
            this.f1960b = nVar;
            this.f1961c = (String) aVar.f555s;
            this.f1962d = ((B) aVar.f556t).d();
            this.f1963e = p120l9.w.k0(aVar.f557u);
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public u(Layout layout) {
        this.f1959a = 2;
        this.f1960b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iB1 = H9.o.b1(((Layout) this.f1960b).getText(), '\n', length, 4);
            length = iB1 < 0 ? ((Layout) this.f1960b).getText().length() : iB1 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f1960b).getText().length());
        this.f1961c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f1962d = arrayList2;
        this.f1963e = new boolean[((ArrayList) this.f1961c).size()];
        ((ArrayList) this.f1961c).size();
    }

    public u(j jVar, String str, B6.b bVar, B6.d dVar, v vVar) {
        this.f1959a = 0;
        this.f1960b = jVar;
        this.f1961c = str;
        this.f1962d = bVar;
        this.f1963e = dVar;
        this.f1964f = vVar;
    }

    public u(p100j8.a aVar, p100j8.b bVar) {
        this.f1959a = 4;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<p100j8.h> set = aVar.f18788c;
        Set set2 = aVar.g;
        for (p100j8.h hVar : set) {
            int i10 = hVar.f18807c;
            int i11 = hVar.f18806b;
            boolean z10 = i10 == 0;
            p100j8.p pVar = hVar.f18805a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(pVar);
                } else {
                    hashSet.add(pVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(pVar);
            } else if (i11 == 2) {
                hashSet5.add(pVar);
            } else {
                hashSet2.add(pVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(p100j8.p.a(G8.a.class));
        }
        this.f1960b = DesugarCollections.unmodifiableSet(hashSet);
        this.f1961c = DesugarCollections.unmodifiableSet(hashSet2);
        this.f1962d = DesugarCollections.unmodifiableSet(hashSet3);
        this.f1963e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f1964f = bVar;
    }

    public u(C0515g c0515g, L l10, List list, p063g1.c cVar, Y0.d dVar) {
        int i10;
        String strSubstring;
        C0515g c0515g2 = c0515g;
        L l11 = l10;
        int i11 = 1;
        this.f1959a = 1;
        this.f1960b = c0515g2;
        this.f1961c = list;
        U0.q qVar = new U0.q(this, i11);
        p110k9.h hVar = p110k9.h.f19075s;
        this.f1962d = p110k9.a.c(hVar, qVar);
        int i12 = 0;
        this.f1963e = p110k9.a.c(hVar, new U0.q(this, i12));
        U0.u uVar = l11.f8038b;
        C0515g c0515g3 = AbstractC0517i.f8088a;
        ArrayList arrayList = c0515g2.f8062u;
        String str = c0515g2.f8060s;
        p120l9.r rVar = p120l9.r.f19440r;
        List listY0 = arrayList != null ? p120l9.m.y0(arrayList, new C0514f(i11)) : rVar;
        ArrayList arrayList2 = new ArrayList();
        p120l9.k kVar = new p120l9.k();
        int size = listY0.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            C0513e c0513e = (C0513e) listY0.get(i13);
            C0513e c0513eA = C0513e.a(c0513e, uVar.a((U0.u) c0513e.f8054a), i12, 14);
            Object obj = c0513eA.f8054a;
            int i15 = c0513eA.f8056c;
            int i16 = c0513eA.f8055b;
            while (i14 < i16 && !kVar.isEmpty()) {
                C0513e c0513e2 = (C0513e) kVar.last();
                listY0 = listY0;
                int i17 = c0513e2.f8056c;
                rVar = rVar;
                Object obj2 = c0513e2.f8054a;
                if (i16 < i17) {
                    arrayList2.add(new C0513e(i14, i16, obj2));
                    i14 = i16;
                } else {
                    int i18 = size;
                    arrayList2.add(new C0513e(i14, i17, obj2));
                    i14 = c0513e2.f8056c;
                    while (!kVar.isEmpty() && i14 == ((C0513e) kVar.last()).f8056c) {
                        kVar.removeLast();
                    }
                    size = i18;
                }
            }
            List list2 = listY0;
            p120l9.r rVar2 = rVar;
            int i19 = size;
            if (i14 < i16) {
                arrayList2.add(new C0513e(i14, i16, uVar));
                i14 = i16;
            }
            C0513e c0513e3 = (C0513e) kVar.h();
            if (c0513e3 != null) {
                int i20 = c0513e3.f8056c;
                Object obj3 = c0513e3.f8054a;
                int i21 = c0513e3.f8055b;
                if (i21 == i16 && i20 == i15) {
                    kVar.removeLast();
                    kVar.addLast(new C0513e(i16, i15, ((U0.u) obj3).a((U0.u) obj)));
                } else if (i21 == i20) {
                    arrayList2.add(new C0513e(i21, i20, obj3));
                    kVar.removeLast();
                    kVar.addLast(new C0513e(i16, i15, obj));
                } else if (i20 >= i15) {
                    kVar.addLast(new C0513e(i16, i15, ((U0.u) obj3).a((U0.u) obj)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                kVar.addLast(new C0513e(i16, i15, obj));
            }
            i13++;
            listY0 = list2;
            rVar = rVar2;
            size = i19;
            i12 = 0;
        }
        p120l9.r rVar3 = rVar;
        while (i14 <= str.length() && !kVar.isEmpty()) {
            C0513e c0513e4 = (C0513e) kVar.last();
            Object obj4 = c0513e4.f8054a;
            int i22 = c0513e4.f8056c;
            arrayList2.add(new C0513e(i14, i22, obj4));
            while (!kVar.isEmpty() && i22 == ((C0513e) kVar.last()).f8056c) {
                kVar.removeLast();
            }
            i14 = i22;
        }
        if (i14 < str.length()) {
            arrayList2.add(new C0513e(i14, str.length(), uVar));
        }
        if (arrayList2.isEmpty()) {
            i10 = 0;
            arrayList2.add(new C0513e(0, 0, uVar));
        } else {
            i10 = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i23 = i10;
        while (i23 < size2) {
            C0513e c0513e5 = (C0513e) arrayList2.get(i23);
            int i24 = c0513e5.f8055b;
            int i25 = c0513e5.f8056c;
            if (i24 != i25) {
                strSubstring = str.substring(i24, i25);
                p251z9.j.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = AbstractC0517i.a(c0515g2, i24, i25, C0516h.f8079s);
            C0515g c0515g4 = new C0515g(strSubstring, listA == null ? rVar3 : listA);
            U0.u uVar2 = (U0.u) c0513e5.f8054a;
            if (uVar2.f8125b == Integer.MIN_VALUE) {
                uVar2 = new U0.u(uVar2.f8124a, uVar.f8125b, uVar2.f8126c, uVar2.f8127d, uVar2.f8128e, uVar2.f8129f, uVar2.g, uVar2.f8130h, uVar2.f8131i);
            }
            L l12 = new L(l11.f8037a, uVar.a(uVar2));
            List list3 = c0515g4.f8059r;
            List list4 = list3 == null ? rVar3 : list3;
            List list5 = (List) this.f1961c;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i26 = 0;
            while (i26 < size3) {
                C0513e c0513e6 = (C0513e) list5.get(i26);
                U0.u uVar3 = uVar;
                int i27 = c0513e6.f8055b;
                L l13 = l12;
                int i28 = c0513e6.f8056c;
                if (AbstractC0517i.b(i24, i25, i27, i28)) {
                    if (i24 > i27 || i28 > i25) {
                        p002a1.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new C0513e(i27 - i24, i28 - i24, c0513e6.f8054a));
                }
                i26++;
                list5 = list5;
                l12 = l13;
                uVar = uVar3;
            }
            arrayList3.add(new U0.s(new p022c1.c(strSubstring, l12, list4, arrayList4, dVar, cVar), i24, i25));
            i23++;
            c0515g2 = c0515g;
            l11 = l10;
            arrayList2 = arrayList2;
        }
        this.f1964f = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(p249z7.e eVar) {
        this.f1959a = 8;
        this.f1960b = (ViewGroup) eVar;
        View view = (View) eVar;
        this.f1961c = (ViewGroup) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f1962d = paint;
        paint.setColor(0);
    }

    public u(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f1959a = 6;
        this.f1964f = mediaBrowserServiceCompat;
        this.f1959a = 6;
        this.f1963e = mediaBrowserServiceCompat;
        this.f1960b = new ArrayList();
    }
}
