package M;

import A.M0;
import I1.AbstractC0272z;
import K.W;
import K0.c1;
import O.N;
import U0.K;
import Z0.C0710a;
import Z0.C0714e;
import Z0.C0715f;
import Z0.InterfaceC0716g;
import Z0.v;
import Z0.w;
import Z0.x;
import Z0.y;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class q implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p248z6.c f5652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f5654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f5655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f5656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5657f;
    public y g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5659i;
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5660k = true;

    public q(y yVar, p248z6.c cVar, boolean z10, W w9, N n6, c1 c1Var) {
        this.f5652a = cVar;
        this.f5653b = z10;
        this.f5654c = w9;
        this.f5655d = n6;
        this.f5656e = c1Var;
        this.g = yVar;
    }

    public final void a(InterfaceC0716g interfaceC0716g) {
        this.f5657f++;
        try {
            this.j.add(interfaceC0716g);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [y9.c, z9.k] */
    public final boolean b() {
        int i10 = this.f5657f - 1;
        this.f5657f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((p) this.f5652a.f24847s).f5643c.e(p120l9.m.D0(arrayList));
                arrayList.clear();
            }
        }
        return this.f5657f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f5660k;
        if (!z10) {
            return z10;
        }
        this.f5657f++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f5660k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f5657f = 0;
        this.f5660k = false;
        ArrayList arrayList = ((p) this.f5652a.f24847s).j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p251z9.j.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f5660k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f5660k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f5660k;
        return z10 ? this.f5653b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f5660k;
        if (z10) {
            a(new C0710a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f5660k;
        if (!z10) {
            return z10;
        }
        a(new C0714e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f5660k;
        if (!z10) {
            return z10;
        }
        a(new C0715f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f5660k;
        if (!z10) {
            return z10;
        }
        a(new Z0.i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        y yVar = this.g;
        return TextUtils.getCapsMode(yVar.f10953a.f8060s, K.e(yVar.f10954b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f5659i = z10;
        if (z10) {
            this.f5658h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return va.g.g(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (K.b(this.g.f10954b)) {
            return null;
        }
        return Y2.a.L(this.g).f8060s;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return Y2.a.P(this.g, i10).f8060s;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return Y2.a.Q(this.g, i10).f8060s;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f5660k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new x(0, this.g.f10953a.f8060s.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f5660k;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            ((p) this.f5652a.f24847s).f5644d.e(new Z0.j(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            M0 m10 = new M0(19, this);
            W w9 = this.f5654c;
            int iL = w9 != null ? AbstractC0272z.l(w9, handwritingGesture, this.f5655d, this.f5656e, m10) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new d(iL, 0, intConsumer));
            } else {
                intConsumer.accept(iL);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f5660k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        W w9;
        if (Build.VERSION.SDK_INT < 34 || (w9 = this.f5654c) == null) {
            return false;
        }
        return AbstractC0272z.m(w9, previewableHandwritingGesture, this.f5655d, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        m mVar;
        boolean z13 = this.f5660k;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z11 = (i10 & 16) != 0;
            z12 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z11 || z12 || z17 || z14) {
                z10 = z14;
                z14 = z17;
            } else {
                if (i11 >= 34) {
                    z10 = true;
                    z14 = true;
                } else {
                    z10 = z14;
                    z14 = true;
                }
                z11 = z14;
            }
            mVar = ((p) this.f5652a.f24847s).f5651m;
            synchronized (mVar.f5626c) {
                try {
                    mVar.f5629f = z11;
                    mVar.g = z12;
                    mVar.f5630h = z14;
                    mVar.f5631i = z10;
                    if (z15) {
                        mVar.f5628e = true;
                        if (mVar.j != null) {
                            mVar.a();
                        }
                    }
                    mVar.f5627d = z16;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z10 = false;
        z11 = true;
        z12 = z11;
        mVar = ((p) this.f5652a.f24847s).f5651m;
        synchronized (mVar.f5626c) {
            mVar.f5629f = z11;
            mVar.g = z12;
            mVar.f5630h = z14;
            mVar.f5631i = z10;
            if (z15) {
                mVar.f5628e = true;
                if (mVar.j != null) {
                    mVar.a();
                }
            }
            mVar.f5627d = z16;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k9.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f5660k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((p) this.f5652a.f24847s).f5649k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f5660k;
        if (z10) {
            a(new v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f5660k;
        if (z10) {
            a(new w(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f5660k;
        if (!z10) {
            return z10;
        }
        a(new x(i10, i11));
        return true;
    }
}
