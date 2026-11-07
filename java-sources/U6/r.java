package U6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0526d, InterfaceC0524b, InterfaceC0525c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f8302b = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8303a;

    public /* synthetic */ r(Object obj) {
        this.f8303a = obj;
    }

    public static View f(Context context, int i10, int i11) throws a7.c {
        r rVar = f8302b;
        try {
            q qVar = new q(1, i10, i11, null);
            return (View) a7.b.G0(((p) rVar.e(context)).G0(new a7.b(context), qVar));
        } catch (Exception e10) {
            throw new a7.c(android.support.v4.media.session.p.w(i10, i11, "Could not get button with size ", " and color "), e10);
        }
    }

    @Override // U6.InterfaceC0524b
    public void a(int i10) {
        ((S6.d) this.f8303a).a(i10);
    }

    @Override // U6.InterfaceC0526d
    public void b(R6.b bVar) {
        AbstractC0527e abstractC0527e = (AbstractC0527e) this.f8303a;
        if (bVar.f7234s == 0) {
            abstractC0527e.j(null, abstractC0527e.t());
            return;
        }
        InterfaceC0525c interfaceC0525c = abstractC0527e.f8239p;
        if (interfaceC0525c != null) {
            interfaceC0525c.g(bVar);
        }
    }

    @Override // U6.InterfaceC0524b
    public void c() {
        ((S6.d) this.f8303a).c();
    }

    public p d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator", 1);
    }

    public Object e(Context context) throws a7.c {
        Context contextCreatePackageContext;
        if (((p) this.f8303a) == null) {
            y.f(context);
            AtomicBoolean atomicBoolean = R6.h.f7247a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new a7.c("Could not get remote context.");
            }
            try {
                this.f8303a = d((IBinder) contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e10) {
                throw new a7.c("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new a7.c("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new a7.c("Could not instantiate creator.", e12);
            }
        }
        return (p) this.f8303a;
    }

    @Override // U6.InterfaceC0525c
    public void g(R6.b bVar) {
        ((S6.e) this.f8303a).g(bVar);
    }
}
