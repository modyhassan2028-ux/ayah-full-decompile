package K0;

import K9.InterfaceC0402u;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: K0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0367s extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f5162s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0367s(AndroidComposeView androidComposeView, int i10) {
        super(1);
        this.f5161r = i10;
        this.f5162s = androidComposeView;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p162q0.d dVar;
        switch (this.f5161r) {
            case 0:
                KeyEvent keyEvent = ((B0.b) obj).f585a;
                AndroidComposeView androidComposeView = this.f5162s;
                int[] iArr = androidComposeView.f12034i0;
                long jH = B0.c.H(keyEvent);
                if (B0.a.a(jH, B0.a.g)) {
                    dVar = new p162q0.d(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (B0.a.a(jH, B0.a.f577e)) {
                    dVar = new p162q0.d(4);
                } else if (B0.a.a(jH, B0.a.f576d)) {
                    dVar = new p162q0.d(3);
                } else {
                    if (B0.a.a(jH, B0.a.f574b) ? true : B0.a.a(jH, B0.a.f581k)) {
                        dVar = new p162q0.d(5);
                    } else {
                        if (B0.a.a(jH, B0.a.f575c) ? true : B0.a.a(jH, B0.a.f582l)) {
                            dVar = new p162q0.d(6);
                        } else {
                            if (B0.a.a(jH, B0.a.f578f) ? true : B0.a.a(jH, B0.a.f580i) ? true : B0.a.a(jH, B0.a.f583m)) {
                                dVar = new p162q0.d(7);
                            } else {
                                dVar = B0.a.a(jH, B0.a.f573a) ? true : B0.a.a(jH, B0.a.j) ? new p162q0.d(8) : null;
                            }
                        }
                    }
                }
                if (dVar != null) {
                    int i10 = dVar.f21191a;
                    if (B0.c.O(keyEvent) == 2) {
                        Integer numD = p162q0.f.D(i10);
                        p171r0.e eVarD = androidComposeView.D();
                        Boolean boolD = ((p162q0.k) androidComposeView.getFocusOwner()).d(i10, eVarD, new r(dVar, 1));
                        if (boolD != null ? boolD.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i10 == 1 || i10 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numD != null) {
                            int iIntValue = numD.intValue();
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View viewFindNextFocus = androidComposeView;
                            while (true) {
                                if (viewFindNextFocus != null) {
                                    View rootView = androidComposeView.getRootView();
                                    p251z9.j.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                                    if (viewFindNextFocus != null) {
                                        if (!viewFindNextFocus.equals(androidComposeView)) {
                                            ViewParent parent = viewFindNextFocus.getParent();
                                            while (true) {
                                                if (parent != null) {
                                                    if (parent != androidComposeView) {
                                                        parent = parent.getParent();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    viewFindNextFocus = null;
                                }
                            }
                            if (p251z9.j.a(viewFindNextFocus, androidComposeView)) {
                                viewFindNextFocus = null;
                            }
                            if (viewFindNextFocus != null) {
                                Rect rectS = eVarD != null ? p180s0.F.s(eVarD) : null;
                                if (rectS == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                viewFindNextFocus.getLocationInWindow(iArr);
                                int i11 = iArr[0];
                                int i12 = iArr[1];
                                androidComposeView.getLocationInWindow(iArr);
                                rectS.offset(iArr[0] - i11, iArr[1] - i12);
                                if (p162q0.f.z(viewFindNextFocus, numD, rectS)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((p162q0.k) androidComposeView.getFocusOwner()).b(i10, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolD2 = ((p162q0.k) androidComposeView.getFocusOwner()).d(i10, null, new r(dVar, 0));
                        return Boolean.valueOf(boolD2 != null ? boolD2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                p241y9.a aVar = (p241y9.a) obj;
                AndroidComposeView androidComposeView2 = this.f5162s;
                Handler handler = androidComposeView2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = androidComposeView2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0373v(0, aVar));
                    }
                }
                return p110k9.y.f19095a;
            default:
                AndroidComposeView androidComposeView3 = this.f5162s;
                return new V(androidComposeView3, androidComposeView3.getTextInputService(), (InterfaceC0402u) obj);
        }
    }
}
