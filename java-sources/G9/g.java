package G9;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2932c;

    public /* synthetic */ g(Object obj, p241y9.c cVar, int i10) {
        this.f2930a = i10;
        this.f2931b = obj;
        this.f2932c = cVar;
    }

    @Override // G9.i
    public final Iterator iterator() {
        switch (this.f2930a) {
            case 0:
                return new f(this);
            case 1:
                return new f(this, (byte) 0);
            case 2:
                return new h(this);
            case 3:
                return new H9.b(this);
            default:
                return new f(this, (char) 0);
        }
    }

    public g(File file) {
        this.f2930a = 4;
        this.f2931b = file;
        this.f2932c = v9.f.f23393r;
    }

    public g(g gVar, A3.e eVar) {
        this.f2930a = 1;
        o oVar = o.f2946z;
        this.f2931b = gVar;
        this.f2932c = eVar;
    }

    public g(CharSequence charSequence, p241y9.e eVar) {
        this.f2930a = 3;
        p251z9.j.e(charSequence, "input");
        this.f2931b = charSequence;
        this.f2932c = eVar;
    }
}
