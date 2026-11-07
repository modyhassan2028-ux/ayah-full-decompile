package Q8;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p110k9.o f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p110k9.o f6890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p110k9.o f6891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6892f;

    public F(Context context, l0 l0Var) {
        p251z9.j.e(context, "appContext");
        p251z9.j.e(l0Var, "uuidGenerator");
        this.f6887a = context;
        final int i10 = 0;
        this.f6888b = p110k9.a.d(new p241y9.a(this) { // from class: Q8.E

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ F f6886s;

            {
                this.f6886s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ((G) this.f6886s.f6891e.getValue()).f6893a;
                    default:
                        return H.b(this.f6886s.f6887a);
                }
            }
        });
        this.f6889c = Process.myPid();
        this.f6890d = p110k9.a.d(new B3.f(4, l0Var));
        final int i11 = 1;
        this.f6891e = p110k9.a.d(new p241y9.a(this) { // from class: Q8.E

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ F f6886s;

            {
                this.f6886s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ((G) this.f6886s.f6891e.getValue()).f6893a;
                    default:
                        return H.b(this.f6886s.f6887a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f6888b.getValue();
    }

    public final Map b(Map map) {
        p110k9.o oVar = this.f6890d;
        if (map == null) {
            return p120l9.w.h0(new p110k9.j(a(), new D(Process.myPid(), (String) oVar.getValue())));
        }
        LinkedHashMap linkedHashMapL0 = p120l9.w.l0(map);
        linkedHashMapL0.put(a(), new D(Process.myPid(), (String) oVar.getValue()));
        return p120l9.w.k0(linkedHashMapL0);
    }
}
