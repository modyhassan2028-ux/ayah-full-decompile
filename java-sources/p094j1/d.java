package p094j1;

import K9.InterfaceC0402u;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f18715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f18716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f18717u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z10, AndroidViewHolder androidViewHolder, long j, c cVar) {
        super(2, cVar);
        this.f18715s = z10;
        this.f18716t = androidViewHolder;
        this.f18717u = j;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        return new d(this.f18715s, this.f18716t, this.f18717u, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r4.a(0, r10.f18717u, r10) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r4.a(r10.f18717u, 0, r10) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r3;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f18714r
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            p110k9.a.e(r11)
            goto L46
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            p110k9.a.e(r11)
            r9 = r10
            goto L46
        L1b:
            p110k9.a.e(r11)
            boolean r11 = r10.f18715s
            androidx.compose.ui.viewinterop.AndroidViewHolder r0 = r10.f18716t
            p9.a r3 = p161p9.a.f21156r
            if (r11 != 0) goto L36
            C0.d r4 = r0.f12113r
            r10.f18714r = r2
            r5 = 0
            long r7 = r10.f18717u
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L46
            goto L45
        L36:
            r9 = r10
            C0.d r4 = r0.f12113r
            r9.f18714r = r1
            long r5 = r9.f18717u
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L46
        L45:
            return r3
        L46:
            k9.y r11 = p110k9.y.f19095a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p094j1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
