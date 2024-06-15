
namespace Parte02
{
    partial class FormMenuPrincipal
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormMenuPrincipal));
            panelContenedor = new Panel();
            panelFormularios = new Panel();
            label1 = new Label();
            pictureBox1 = new PictureBox();
            panelMenu = new Panel();
            btnServicios = new Button();
            btnProductos = new Button();
            btnIngresar = new Button();
            panelBarraTitulo = new Panel();
            label2 = new Label();
            pictureBox2 = new PictureBox();
            btnRestaurar = new PictureBox();
            btnMaximizar = new PictureBox();
            btnCerrar = new PictureBox();
            btnMinimizar = new PictureBox();
            panelMenuHeader = new Panel();
            pictureBoxPhoto = new PictureBox();
            lbName = new Label();
            lbLastName = new Label();
            lbPosition = new Label();
            linkProfile = new LinkLabel();
            panelContenedor.SuspendLayout();
            panelFormularios.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            panelMenu.SuspendLayout();
            panelBarraTitulo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).BeginInit();
            ((System.ComponentModel.ISupportInitialize)btnRestaurar).BeginInit();
            ((System.ComponentModel.ISupportInitialize)btnMaximizar).BeginInit();
            ((System.ComponentModel.ISupportInitialize)btnCerrar).BeginInit();
            ((System.ComponentModel.ISupportInitialize)btnMinimizar).BeginInit();
            panelMenuHeader.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBoxPhoto).BeginInit();
            SuspendLayout();
            // 
            // panelContenedor
            // 
            panelContenedor.BackColor = SystemColors.ButtonHighlight;
            panelContenedor.Controls.Add(panelFormularios);
            panelContenedor.Controls.Add(panelMenu);
            panelContenedor.Controls.Add(panelBarraTitulo);
            panelContenedor.Dock = DockStyle.Fill;
            panelContenedor.Location = new Point(0, 0);
            panelContenedor.Name = "panelContenedor";
            panelContenedor.Size = new Size(1100, 600);
            panelContenedor.TabIndex = 0;
            // 
            // panelFormularios
            // 
            panelFormularios.BackColor = SystemColors.Control;
            panelFormularios.Controls.Add(label1);
            panelFormularios.Controls.Add(pictureBox1);
            panelFormularios.Dock = DockStyle.Fill;
            panelFormularios.Location = new Point(240, 40);
            panelFormularios.Name = "panelFormularios";
            panelFormularios.Size = new Size(860, 560);
            panelFormularios.TabIndex = 2;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 10.8F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(274, 408);
            label1.Name = "label1";
            label1.Size = new Size(287, 25);
            label1.TabIndex = 1;
            label1.Text = "FUNERARIA NUEVO AMANECER";
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(274, 120);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(287, 323);
            pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
            pictureBox1.TabIndex = 0;
            pictureBox1.TabStop = false;
            // 
            // panelMenu
            // 
            panelMenu.BackColor = Color.DimGray;
            panelMenu.Controls.Add(panelMenuHeader);
            panelMenu.Controls.Add(btnServicios);
            panelMenu.Controls.Add(btnProductos);
            panelMenu.Controls.Add(btnIngresar);
            panelMenu.Dock = DockStyle.Left;
            panelMenu.Location = new Point(0, 40);
            panelMenu.Name = "panelMenu";
            panelMenu.Size = new Size(240, 560);
            panelMenu.TabIndex = 1;
            // 
            // btnServicios
            // 
            btnServicios.FlatAppearance.BorderSize = 0;
            btnServicios.FlatStyle = FlatStyle.Flat;
            btnServicios.Location = new Point(3, 246);
            btnServicios.Name = "btnServicios";
            btnServicios.Size = new Size(230, 45);
            btnServicios.TabIndex = 2;
            btnServicios.Text = "Servicios";
            btnServicios.UseVisualStyleBackColor = true;
            // 
            // btnProductos
            // 
            btnProductos.FlatAppearance.BorderSize = 0;
            btnProductos.FlatStyle = FlatStyle.Flat;
            btnProductos.ImageAlign = ContentAlignment.MiddleLeft;
            btnProductos.Location = new Point(4, 195);
            btnProductos.Name = "btnProductos";
            btnProductos.Size = new Size(230, 45);
            btnProductos.TabIndex = 1;
            btnProductos.Text = "Productos";
            btnProductos.UseVisualStyleBackColor = true;
            btnProductos.Click += button2_Click;
            // 
            // btnIngresar
            // 
            btnIngresar.FlatAppearance.BorderSize = 0;
            btnIngresar.FlatStyle = FlatStyle.Flat;
            btnIngresar.Font = new Font("Segoe UI", 10.2F, FontStyle.Regular, GraphicsUnit.Point, 0);
            btnIngresar.Image = (Image)resources.GetObject("btnIngresar.Image");
            btnIngresar.ImageAlign = ContentAlignment.MiddleLeft;
            btnIngresar.Location = new Point(3, 144);
            btnIngresar.Name = "btnIngresar";
            btnIngresar.Size = new Size(234, 45);
            btnIngresar.TabIndex = 0;
            btnIngresar.Text = "Usuarios";
            btnIngresar.UseVisualStyleBackColor = true;
            btnIngresar.Click += button1_Click;
            // 
            // panelBarraTitulo
            // 
            panelBarraTitulo.BackColor = Color.Gray;
            panelBarraTitulo.Controls.Add(label2);
            panelBarraTitulo.Controls.Add(pictureBox2);
            panelBarraTitulo.Controls.Add(btnRestaurar);
            panelBarraTitulo.Controls.Add(btnMaximizar);
            panelBarraTitulo.Controls.Add(btnCerrar);
            panelBarraTitulo.Controls.Add(btnMinimizar);
            panelBarraTitulo.Dock = DockStyle.Top;
            panelBarraTitulo.Location = new Point(0, 0);
            panelBarraTitulo.Name = "panelBarraTitulo";
            panelBarraTitulo.Size = new Size(1100, 40);
            panelBarraTitulo.TabIndex = 0;
            panelBarraTitulo.MouseMove += panelBarraTitulo_MouseMove;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(43, 11);
            label2.Name = "label2";
            label2.Size = new Size(222, 20);
            label2.TabIndex = 3;
            label2.Text = "FUNERARIA NUEVO AMANECER";
            // 
            // pictureBox2
            // 
            pictureBox2.Image = Properties.Resources.Logo;
            pictureBox2.Location = new Point(17, 11);
            pictureBox2.Name = "pictureBox2";
            pictureBox2.Size = new Size(20, 20);
            pictureBox2.SizeMode = PictureBoxSizeMode.Zoom;
            pictureBox2.TabIndex = 2;
            pictureBox2.TabStop = false;
            // 
            // btnRestaurar
            // 
            btnRestaurar.Anchor = AnchorStyles.Top | AnchorStyles.Right;
            btnRestaurar.Image = (Image)resources.GetObject("btnRestaurar.Image");
            btnRestaurar.Location = new Point(1034, 12);
            btnRestaurar.Name = "btnRestaurar";
            btnRestaurar.Size = new Size(16, 16);
            btnRestaurar.SizeMode = PictureBoxSizeMode.Zoom;
            btnRestaurar.TabIndex = 1;
            btnRestaurar.TabStop = false;
            btnRestaurar.Visible = false;
            btnRestaurar.Click += btnRestaurar_Click;
            // 
            // btnMaximizar
            // 
            btnMaximizar.Anchor = AnchorStyles.Top | AnchorStyles.Right;
            btnMaximizar.Cursor = Cursors.Hand;
            btnMaximizar.Image = Properties.Resources.maximize3;
            btnMaximizar.Location = new Point(1034, 12);
            btnMaximizar.Name = "btnMaximizar";
            btnMaximizar.Size = new Size(16, 16);
            btnMaximizar.SizeMode = PictureBoxSizeMode.Zoom;
            btnMaximizar.TabIndex = 0;
            btnMaximizar.TabStop = false;
            btnMaximizar.Click += btnMaximizar_Click;
            // 
            // btnCerrar
            // 
            btnCerrar.Anchor = AnchorStyles.Top | AnchorStyles.Right;
            btnCerrar.Cursor = Cursors.Hand;
            btnCerrar.Image = (Image)resources.GetObject("btnCerrar.Image");
            btnCerrar.Location = new Point(1056, 12);
            btnCerrar.Name = "btnCerrar";
            btnCerrar.Size = new Size(16, 16);
            btnCerrar.SizeMode = PictureBoxSizeMode.Zoom;
            btnCerrar.TabIndex = 0;
            btnCerrar.TabStop = false;
            btnCerrar.Click += btnCerrar_Click_1;
            // 
            // btnMinimizar
            // 
            btnMinimizar.Anchor = AnchorStyles.Top | AnchorStyles.Right;
            btnMinimizar.Cursor = Cursors.Hand;
            btnMinimizar.Image = (Image)resources.GetObject("btnMinimizar.Image");
            btnMinimizar.Location = new Point(1012, 12);
            btnMinimizar.Name = "btnMinimizar";
            btnMinimizar.Size = new Size(16, 16);
            btnMinimizar.SizeMode = PictureBoxSizeMode.Zoom;
            btnMinimizar.TabIndex = 0;
            btnMinimizar.TabStop = false;
            btnMinimizar.Click += btnMinimizar_Click_1;
            // 
            // panelMenuHeader
            // 
            panelMenuHeader.BackColor = Color.Gray;
            panelMenuHeader.Controls.Add(linkProfile);
            panelMenuHeader.Controls.Add(lbPosition);
            panelMenuHeader.Controls.Add(lbLastName);
            panelMenuHeader.Controls.Add(lbName);
            panelMenuHeader.Controls.Add(pictureBoxPhoto);
            panelMenuHeader.Location = new Point(0, 0);
            panelMenuHeader.Name = "panelMenuHeader";
            panelMenuHeader.Size = new Size(240, 138);
            panelMenuHeader.TabIndex = 3;
            // 
            // pictureBoxPhoto
            // 
            pictureBoxPhoto.Image = (Image)resources.GetObject("pictureBoxPhoto.Image");
            pictureBoxPhoto.Location = new Point(17, 16);
            pictureBoxPhoto.Name = "pictureBoxPhoto";
            pictureBoxPhoto.Size = new Size(70, 61);
            pictureBoxPhoto.SizeMode = PictureBoxSizeMode.Zoom;
            pictureBoxPhoto.TabIndex = 2;
            pictureBoxPhoto.TabStop = false;
            // 
            // lbName
            // 
            lbName.AutoSize = true;
            lbName.Location = new Point(93, 16);
            lbName.Name = "lbName";
            lbName.Size = new Size(49, 20);
            lbName.TabIndex = 3;
            lbName.Text = "Name";
            // 
            // lbLastName
            // 
            lbLastName.AutoSize = true;
            lbLastName.Location = new Point(93, 36);
            lbLastName.Name = "lbLastName";
            lbLastName.Size = new Size(79, 20);
            lbLastName.TabIndex = 4;
            lbLastName.Text = "Last Name";
            // 
            // lbPosition
            // 
            lbPosition.AutoSize = true;
            lbPosition.Location = new Point(93, 57);
            lbPosition.Name = "lbPosition";
            lbPosition.Size = new Size(61, 20);
            lbPosition.TabIndex = 5;
            lbPosition.Text = "Position";
            // 
            // linkProfile
            // 
            linkProfile.AutoSize = true;
            linkProfile.Location = new Point(17, 92);
            linkProfile.Name = "linkProfile";
            linkProfile.Size = new Size(76, 20);
            linkProfile.TabIndex = 6;
            linkProfile.TabStop = true;
            linkProfile.Text = "My Profile";
            // 
            // FormMenuPrincipal
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1100, 600);
            Controls.Add(panelContenedor);
            FormBorderStyle = FormBorderStyle.None;
            MinimumSize = new Size(680, 500);
            Name = "FormMenuPrincipal";
            Text = "Form1";
            panelContenedor.ResumeLayout(false);
            panelFormularios.ResumeLayout(false);
            panelFormularios.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            panelMenu.ResumeLayout(false);
            panelBarraTitulo.ResumeLayout(false);
            panelBarraTitulo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).EndInit();
            ((System.ComponentModel.ISupportInitialize)btnRestaurar).EndInit();
            ((System.ComponentModel.ISupportInitialize)btnMaximizar).EndInit();
            ((System.ComponentModel.ISupportInitialize)btnCerrar).EndInit();
            ((System.ComponentModel.ISupportInitialize)btnMinimizar).EndInit();
            panelMenuHeader.ResumeLayout(false);
            panelMenuHeader.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBoxPhoto).EndInit();
            ResumeLayout(false);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            AbrirFormulario<Form2>();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            AbrirFormulario<Form1>();
        }

        private void panelBarraTitulo_MouseMove(object sender, MouseEventArgs e)
        {
            ReleaseCapture();
            SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        private void btnRestaurar_Click(object sender, EventArgs e)
        {
            btnMaximizar.Visible = true;
            btnRestaurar.Visible = false;
            this.Size = new Size(sw, sh);
            this.Location = new Point(lx, ly);
        }

        private void btnMaximizar_Click(object sender, EventArgs e)
        {
            lx = this.Location.X;
            ly = this.Location.Y;
            sw = this.Size.Width;
            sh = this.Size.Height;
            btnMaximizar.Visible = false;
            btnRestaurar.Visible = true;
            this.Size = Screen.PrimaryScreen.WorkingArea.Size;
            this.Location = Screen.PrimaryScreen.WorkingArea.Location;
        }

        private void btnCerrar_Click_1(object sender, EventArgs e)
        {
            Application.Exit();
        }

        //Capturar posicion y tamaño antes de maximizar para restaurar
        int lx, ly;
        int sw, sh;

        private void btnMinimizar_Click_1(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        #endregion

        private Panel panelContenedor;
        private Panel panelBarraTitulo;
        private Panel panelFormularios;
        private Panel panelMenu;
        private PictureBox btnCerrar;
        private PictureBox btnMaximizar;
        private PictureBox btnMinimizar;
        private PictureBox btnRestaurar;
        private Button btnServicios;
        private Button btnProductos;
        private Button btnIngresar;
        private Label label1;
        private PictureBox pictureBox1;
        private PictureBox pictureBox2;
        private Label label2;
        private Panel panelMenuHeader;
        private PictureBox pictureBoxPhoto;
        private Label lbLastName;
        private Label lbName;
        private LinkLabel linkProfile;
        private Label lbPosition;
    }
}
