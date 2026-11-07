package R0;

import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7114s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, int i10) {
        super(1);
        this.f7113r = i10;
        this.f7114s = str;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f7113r;
        y yVar = y.f19095a;
        String str = this.f7114s;
        switch (i10) {
            case 0:
                u.d((j) obj, str);
                break;
            case 1:
                F9.f[] fVarArr = u.f7181a;
                v vVar = s.f7159d;
                F9.f fVar = u.f7181a[2];
                vVar.a((j) obj, str);
                break;
            case 2:
                u.d((j) obj, str);
                break;
            case 3:
                j jVar = (j) obj;
                u.d(jVar, str);
                u.e(jVar, 5);
                break;
            case 4:
                u.d((j) obj, str);
                break;
            case 5:
                j jVar2 = (j) obj;
                u.g(jVar2);
                u.d(jVar2, str);
                break;
            case 6:
                j jVar3 = (j) obj;
                u.e(jVar3, 3);
                u.d(jVar3, str);
                break;
            case 7:
                u.d((j) obj, str);
                break;
            default:
                j jVar4 = (j) obj;
                u.d(jVar4, str);
                u.e(jVar4, 5);
                break;
        }
        return yVar;
    }
}
