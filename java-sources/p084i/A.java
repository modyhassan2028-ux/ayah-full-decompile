package p084i;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.media.session.p;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class A implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f16494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f16495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Method f16496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f16497u;

    public A(View view, String str) {
        this.f16494r = view;
        this.f16495s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f16496t != null) {
            break;
        }
        View view2 = this.f16494r;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f16495s;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbD = p.D("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbD.append(view2.getClass());
                sbD.append(str);
                throw new IllegalStateException(sbD.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f16496t = method;
                    this.f16497u = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f16496t.invoke(this.f16497u, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
