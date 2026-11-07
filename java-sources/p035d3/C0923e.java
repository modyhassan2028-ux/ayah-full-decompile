package p035d3;

import K9.InterfaceC0402u;
import android.content.SharedPreferences;
import com.ayah.AyahApplication;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: renamed from: d3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0923e extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15603r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f15605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AyahApplication f15606u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923e(SharedPreferences sharedPreferences, AyahApplication ayahApplication, c cVar) {
        super(2, cVar);
        this.f15605t = sharedPreferences;
        this.f15606u = ayahApplication;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f15603r) {
            case 0:
                return new C0923e(this.f15606u, this.f15605t, cVar);
            default:
                return new C0923e(this.f15605t, this.f15606u, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f15603r) {
            case 0:
                break;
        }
        return ((C0923e) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r12.c(r11) == r7) goto L35;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f15603r
            k9.y r1 = p110k9.y.f19095a
            java.lang.String r2 = "shouldCleanupOldFiles"
            android.content.SharedPreferences r3 = r11.f15605t
            r4 = 0
            com.ayah.AyahApplication r5 = r11.f15606u
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p9.a r7 = p161p9.a.f21156r
            r8 = 1
            switch(r0) {
                case 0: goto L46;
                default: goto L13;
            }
        L13:
            int r0 = r11.f15604s
            if (r0 == 0) goto L23
            if (r0 != r8) goto L1d
            p110k9.a.e(r12)
            goto L3a
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r6)
            throw r12
        L23:
            p110k9.a.e(r12)
            R9.e r12 = K9.H.f5322a
            R9.d r12 = R9.d.f7436t
            d3.d r0 = new d3.d
            r6 = 4
            r0.<init>(r5, r4, r6)
            r11.f15604s = r8
            java.lang.Object r12 = K9.AbstractC0405x.I(r12, r0, r11)
            if (r12 != r7) goto L3a
            r1 = r7
            goto L45
        L3a:
            android.content.SharedPreferences$Editor r12 = r3.edit()
            android.content.SharedPreferences$Editor r12 = r12.remove(r2)
            r12.apply()
        L45:
            return r1
        L46:
            int r0 = r11.f15604s
            r9 = 2
            if (r0 == 0) goto L5d
            if (r0 == r8) goto L59
            if (r0 != r9) goto L53
            p110k9.a.e(r12)
            goto L8a
        L53:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r6)
            throw r12
        L59:
            p110k9.a.e(r12)
            goto L7c
        L5d:
            p110k9.a.e(r12)
            i0.n r12 = r5.f13610z
            if (r12 == 0) goto L9c
            r11.f15604s = r8
            R9.e r0 = K9.H.f5322a
            R9.d r0 = R9.d.f7436t
            v2.d0 r6 = new v2.d0
            r10 = 8
            r6.<init>(r12, r4, r10)
            java.lang.Object r12 = K9.AbstractC0405x.I(r0, r6, r11)
            if (r12 != r7) goto L78
            goto L79
        L78:
            r12 = r1
        L79:
            if (r12 != r7) goto L7c
            goto L88
        L7c:
            Aa.a r12 = r5.f13608x
            if (r12 == 0) goto L96
            r11.f15604s = r9
            java.lang.Object r12 = r12.c(r11)
            if (r12 != r7) goto L8a
        L88:
            r1 = r7
            goto L95
        L8a:
            android.content.SharedPreferences$Editor r12 = r3.edit()
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r2, r8)
            r12.apply()
        L95:
            return r1
        L96:
            java.lang.String r12 = "bookAutoDownload"
            p251z9.j.k(r12)
            throw r4
        L9c:
            java.lang.String r12 = "audioCleanup"
            p251z9.j.k(r12)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p035d3.C0923e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923e(AyahApplication ayahApplication, SharedPreferences sharedPreferences, c cVar) {
        super(2, cVar);
        this.f15606u = ayahApplication;
        this.f15605t = sharedPreferences;
    }
}
