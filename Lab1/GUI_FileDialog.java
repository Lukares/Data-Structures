import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUI_FileDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	JButton speciesFileButton = new JButton("Species File");
	JButton countyFileButton = new JButton("County File");
	JButton treeDataButton = new JButton("Tree Data File");
	JButton okButton = new JButton("OK");
	JButton cancelButton = new JButton("Cancel");
	
	JLabel countyFileLabel = new JLabel("<filename>");
	JLabel speciesFileLabel = new JLabel("<filename>");
	JLabel treeDataFileLabel = new JLabel("<filename>");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_FileDialog dialog = new GUI_FileDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_FileDialog() {
		setBounds(100, 100, 492, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(3, 1, 50, 50));
		{
			
			contentPanel.add(countyFileButton);
		}
		{
			
			countyFileLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(countyFileLabel);
		}
		{
			
			contentPanel.add(speciesFileButton);
		}
		{
			
			speciesFileLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(speciesFileLabel);
		}
		{
			
			contentPanel.add(treeDataButton);
		}
		{
			
			treeDataFileLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(treeDataFileLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
