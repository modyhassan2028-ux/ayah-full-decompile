package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l[] f18113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f18114b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f18115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f18116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18118f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18119h;

    public p(l[] lVarArr, int i10, int i11, int i12) {
        this.f18113a = lVarArr;
        this.f18119h = i10;
        this.f18117e = i11;
        this.f18118f = i11;
        this.g = i12;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    public final l a() {
        l[] lVarArr;
        int length;
        int i10;
        o oVar;
        int i11;
        int i12;
        int i13;
        int i14;
        l lVar = this.f18114b;
        if (lVar != null) {
            lVar = lVar.f18108d;
        }
        while (lVar == null) {
            if (this.f18118f >= this.g || (lVarArr = this.f18113a) == null || (length = lVarArr.length) <= (i10 = this.f18117e) || i10 < 0) {
                this.f18114b = null;
                return null;
            }
            l lVarK = ConcurrentHashMap.k(lVarArr, i10);
            if (lVarK != null && lVarK.f18105a < 0) {
                if (lVarK instanceof g) {
                    this.f18113a = ((g) lVarK).f18099e;
                    o oVar2 = this.f18116d;
                    if (oVar2 == null) {
                        oVar2 = new o();
                    } else {
                        this.f18116d = oVar2.f18112d;
                    }
                    oVar2.f18111c = lVarArr;
                    oVar2.f18109a = length;
                    oVar2.f18110b = i10;
                    oVar2.f18112d = this.f18115c;
                    this.f18115c = oVar2;
                    lVar = null;
                } else {
                    lVar = lVarK instanceof q ? ((q) lVarK).f18123f : null;
                    if (this.f18115c != null) {
                        while (true) {
                            oVar = this.f18115c;
                            if (oVar != null) {
                                break;
                                break;
                            }
                            int i15 = this.f18117e;
                            i12 = oVar.f18109a;
                            i13 = i15 + i12;
                            this.f18117e = i13;
                            if (i13 >= length) {
                                break;
                                break;
                            }
                            this.f18117e = oVar.f18110b;
                            this.f18113a = oVar.f18111c;
                            oVar.f18111c = null;
                            o oVar3 = oVar.f18112d;
                            oVar.f18112d = this.f18116d;
                            this.f18115c = oVar3;
                            this.f18116d = oVar;
                            length = i12;
                        }
                        if (oVar == null) {
                            i11 = this.f18117e + this.f18119h;
                            this.f18117e = i11;
                            if (i11 >= length) {
                                int i16 = this.f18118f + 1;
                                this.f18118f = i16;
                                this.f18117e = i16;
                            }
                        }
                    } else {
                        i14 = i10 + this.f18119h;
                        this.f18117e = i14;
                        if (i14 >= length) {
                            int i17 = this.f18118f + 1;
                            this.f18118f = i17;
                            this.f18117e = i17;
                        }
                    }
                }
            } else {
                lVar = lVarK;
                if (this.f18115c != null) {
                    while (true) {
                        oVar = this.f18115c;
                        if (oVar != null) {
                            break;
                        }
                        int i18 = this.f18117e;
                        i12 = oVar.f18109a;
                        i13 = i18 + i12;
                        this.f18117e = i13;
                        if (i13 >= length) {
                            break;
                        }
                        this.f18117e = oVar.f18110b;
                        this.f18113a = oVar.f18111c;
                        oVar.f18111c = null;
                        o oVar4 = oVar.f18112d;
                        oVar.f18112d = this.f18116d;
                        this.f18115c = oVar4;
                        this.f18116d = oVar;
                        length = i12;
                    }
                    if (oVar == null) {
                        i11 = this.f18117e + this.f18119h;
                        this.f18117e = i11;
                        if (i11 >= length) {
                            int i19 = this.f18118f + 1;
                            this.f18118f = i19;
                            this.f18117e = i19;
                        }
                    }
                } else {
                    i14 = i10 + this.f18119h;
                    this.f18117e = i14;
                    if (i14 >= length) {
                        int i110 = this.f18118f + 1;
                        this.f18118f = i110;
                        this.f18117e = i110;
                    }
                }
            }
        }
        this.f18114b = lVar;
        return lVar;
    }
}
