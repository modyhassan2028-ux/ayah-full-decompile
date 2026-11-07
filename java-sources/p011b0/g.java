package p011b0;

import G9.j;
import H0.f0;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.h;
import u.C1352g;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f13128A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f13129B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Object f13130C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[] f13132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13134v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f13137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13138z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, c cVar, int i10) {
        super(2, cVar);
        this.f13131s = i10;
        this.f13130C = obj;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f13131s) {
            case 0:
                g gVar = new g((h) this.f13130C, cVar, 0);
                gVar.f13128A = obj;
                return gVar;
            case 1:
                g gVar2 = new g((C1352g) this.f13130C, cVar, 1);
                gVar2.f13128A = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((C1352g) this.f13130C, cVar, 2);
                gVar3.f13128A = obj;
                return gVar3;
            default:
                g gVar4 = new g((f0) this.f13130C, cVar, 3);
                gVar4.f13128A = obj;
                return gVar4;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) obj;
        c cVar = (c) obj2;
        switch (this.f13131s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((g) create(jVar, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x027a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0280  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:16:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:20:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f5 -> B:46:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f7 -> B:39:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0111 -> B:43:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018f -> B:69:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0191 -> B:62:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ac -> B:66:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x023a -> B:92:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x023c -> B:85:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0256 -> B:89:0x0275). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p011b0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
