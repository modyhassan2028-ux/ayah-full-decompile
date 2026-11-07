package I1;

import android.view.View;
import p232y.C1452f;

/* JADX INFO: loaded from: classes.dex */
public final class W extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3703v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f3700s = i10;
        this.f3703v = obj;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3700s) {
            case 0:
                W w9 = new W((View) this.f3703v, cVar, 0);
                w9.f3702u = obj;
                return w9;
            default:
                W w10 = new W((C1452f) this.f3703v, cVar, 1);
                w10.f3702u = obj;
                return w10;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3700s) {
            case 0:
                return ((W) create((G9.j) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((W) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[LOOP:1: B:26:0x0080->B:30:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
